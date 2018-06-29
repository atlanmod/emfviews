;; Use the built-in Org version
(require 'org)
(require 'ox)
(require 'seq)

;; We export two versions of the manual: HTML to the EMF Views website, and as
;; in an Eclipse help plugin.  The website uses the standard HTML org-export
;; backend.  For Eclipse help, we define a derived backend.

(org-export-define-derived-backend 'eclipse-help 'html)


;;; Custom links

;; When we link to stuff from other Eclipse manuals we use a custom `eclipse:'
;; link type.  The website version will link to help.eclipse.org where all the
;; official docs are hosted, and the plugin version will open the locally hosted
;; version.

(org-link-set-parameters "eclipse" :export #'org-eclipse-link-export)

(defun org-eclipse-link-export (path description backend)
  "Export custom Eclipse links.

PATH and DESCRIPTION are the link's path and description.
BACKEND is the export backend."
  (format "<a href=\"%s\">%s</a>"
          ;; For some reason, BACKEND is just 'html, even when the derived
          ;; 'eclipse-help is used.  Luckily, we can use the variable
          ;; `org-export-current-backend' to determine which backend is actually
          ;; in use.
          (concat (if (eq org-export-current-backend 'eclipse-help)
                      "/help"
                    "https://help.eclipse.org/oxygen")
                  path)
          description))

;; We also need a custom link for external links: links that go to the web
;; instead of staying inside the Eclipse help.  In the website export, these
;; will just work as-is, but through the Eclipse help we need to add the
;; `target` attribute.

(org-link-set-parameters "external" :export #'org-eclipse-external-link-export)

(defun org-eclipse-external-link-export (path description backend)
  "Export external links.

PATH and DESCRIPTION are the link's path and description.
BACKEND is the export backend."
  (format "<a class=\"external\" href=\"%s\" target=\"_new\">%s</a>" path description))


;;; Export setup

;; This publishing functions goes with our dervied backend.  It's the same as
;; `org-html-publish-to-html', except it uses the 'eclipse-help backend.
(defun org-eclipse-publish-to-eclipse-help (plist filename pub-dir)
  "Publish an org file to Eclipse help.

FILENAME is the filename of the Org file to be published.  PLIST
is the property list for the given project.  PUB-DIR is the
publishing directory.

Return output file name."
  (org-publish-org-to 'eclipse-help filename
		      (concat "." (or (plist-get plist :html-extension)
				      org-html-extension
				      "html"))
		      plist pub-dir))

;; This is a list of orders for `org-publish-all', basically.
(setq org-publish-project-alist
      `(("eclipse-manual"
         :base-directory "src/"
         :exclude "index.org"
         :publishing-directory "org.atlanmod.emfviews.doc/html/"
         :publishing-function org-eclipse-publish-to-eclipse-help)

        ("online-manual"
         :base-directory "src/"
         :publishing-directory "html/"
         :publishing-function org-html-publish-to-html)

        ;; The assets are exported to two separate folders
        ,@(seq-mapcat (lambda (out-dir)
                        `(("images"
                           :base-directory "src/images/"
                           :base-extension "jpg\\|gif\\|png\\|svg"
                           :publishing-directory ,(concat out-dir "images/")
                           :publishing-function org-publish-attachment)

                          ("stylesheet"
                           :base-directory "src/"
                           :base-extension "css"
                           :publishing-directory ,out-dir
                           :publishing-function org-publish-attachment)))
                      '("org.atlanmod.emfviews.doc/html/" "html/")))

      org-export-with-section-numbers nil
      org-export-time-stamp-file nil    ; timestamp triggers unnecessary builds
                                        ; on CI
      org-html-htmlize-output-type 'css ; export CSS classes of syntax
                                        ; highlighting, but not any style
      org-html-postamble nil            ; no postamble
      org-html-doctype "html5"
      org-html-viewport nil                   ; no viewport directive
      org-html-head-include-default-style nil ; no inline CSS
      org-html-head "<link rel=\"stylesheet\" href=\"style.css\">")

;; For some reason, org-publish will leave backup files around.  We don't want
;; that.
(setq make-backup-files nil)


;;; Highlighting for niche languages

;; We define tiny major modes for ECL, VPDL and the like in order to get syntax
;; highlighting working in the exported output.

(require 'rx)

;; ECL
(defvar ecl-keywords
  (seq-map (lambda (key)
             (rx-to-string `(and bow ,key eow) 'no-group))
           '("rule" "match" "with" "compare" "return"
             "and")))

(define-derived-mode ecl-mode prog-mode "ecl"
  "Epsilon Compare Language mode"
  (setq font-lock-defaults
        `(,ecl-keywords nil nil
                        ((?/ . ". 12")
                         (?\n . ">")
                         (?\" . "\"")))))

;; VPDL
(defvar vpdl-keywords
  (seq-map (lambda (key)
             (rx-to-string `(and bow ,key eow) 'no-group))
           '("create" "view" "as" "select" "join" "for"
             "select" "from" "where" )))

(define-derived-mode vpdl-mode prog-mode "vpdl"
  "VPDL mode"
  (setq font-lock-defaults
        `(,vpdl-keywords nil nilzp
                         ((?/ . ". 124")
                          (?* . ". 23b")
                          (?\n . ">")
                          (?\" . "\"")
                          (?\' . "\"")))))


;;; HACKS

;; Because any project involving org will include hacks.

;; By default, org will inline SVG images using the <object> tag.  This causes a
;; lot of headaches, with the only advantage being the ability to target
;; elements inside the SVG with scripts.  Of course, there is no option for it,
;; so we override its behavior and just wrap the SVG in an <img> tag.
(advice-add 'org-html--svg-image :around
            (lambda (orig-fun source attributes info)
              (format "<img src=\"%s\" %s/>"
                      source
                      (org-html--make-attribute-string attributes))))

;; Set the random seed to a constant value.  Org uses `random' to generate
;; unique identifiers for headlines.  The problem is that these identifiers are
;; then not stable, and in particular it means the automated build on Travis
;; will always pick up changes in the output even if the source does not change.
;; Fixing the seed is a very low-cost fix to get stability back.
(random "random seed")


;;; TOC builder

;; For the Eclipse help version, we want to produce a table of contents as an
;; XML file.  Surprisingly, org does not provide any way to process the table of
;; contents it has extracted himself.  Because we need to get hold off the IDs
;; generated by the exporter, the simplest way is to piggy-back on org-html-toc.

(defvar toc-file "org.atlanmod.emfviews.doc/toc.xml"
  "Where to save the generated TOC file for Eclipse help.")

(defvar toc-buffer (get-buffer-create "*toc-file*")
  "Internal buffer used to write the Eclipse help TOC.")

;; Alas, org-html-toc does not care about the current file being exported, but
;; it is relevant for the TOC file, since it gets a topic entry.  So we set the
;; current file by hooking into `org-eclipse-publish-to-eclipse-help'.
(defvar org-eclipse-current-file)

(advice-add 'org-eclipse-publish-to-eclipse-help :before
            (lambda (plist filename sub-dir)
              (setq org-eclipse-current-file filename)))

;; Then, we build the TOC.  This starts with the header.  Since we will write
;; the TOC as the org file are exported, we need to put the header before
;; publishing, and write the footer after publishing is done.  We could probably
;; use hook to properly plug into that but... this works.
(with-current-buffer toc-buffer
  (insert "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
          "<toc label=\"EMF Views Documentation\">\n"))

;; This is the function that gets called when `org-html-toc' does.  We follow
;; the same logic, which is to collect all headlines, and build the TOC XML from
;; their content.
(defun org-eclipse-build-toc (orig-fun depth info &optional scope)
  "Build a TOC file for Eclipse help."
  ;; For the online manual, we pass through to the original `org-html-toc'.
  ;; However, for the eclipse-help backend, we want to only generate a toc.xml
  ;; file, but not the HTML TOC.  So we write to toc-buffer, but return an empty
  ;; string.
  (if (eq org-export-current-backend 'html)
      (funcall orig-fun depth info scope)
    ;; Get headline content
    (let ((toc-entries
	   (mapcar (lambda (headline)
		     (list (org-export-data-with-backend
		            (org-export-get-alt-title headline info)
		            (org-export-toc-entry-backend 'html)
		            info)
                           (or (org-element-property :CUSTOM_ID headline)
		               (org-export-get-reference headline info))
			   (org-export-get-relative-level headline info)))
		   (org-export-collect-headlines info depth scope))))
      ;; Then write the to XML.  Each entry needs to look at the previous
      ;; headline's level in order to know if we should close the previous topic
      ;; tag, or leave it open, or add a standalone closing tag.
      (when toc-entries
        (let ((prev-level 0)
              (file (concat "html/" (file-name-base org-eclipse-current-file) ".html"))
              (title (with-current-buffer (get-file-buffer org-eclipse-current-file)
                       (org-element-interpret-data
                        (plist-get (org-export-get-environment) :title)))))
          (with-current-buffer toc-buffer
            ;; The file's topic line
            (insert (format "<topic href=\"%s\" label=\"%s\">\n" file title))

            ;; The contents topics
            (pcase-dolist (`(,text ,href ,level) toc-entries)
              (insert (cond
                       ;; don't do anything for the first entry
                       ((= prev-level 0) "")
                       ;; if we are deeper, then the parent entry needs to be open
                       ((> level prev-level) ">\n")
                       ;; on the same level, the previous entry can be closed
                       ((= level prev-level) "/>\n")
                       ;; we go up, so we need to close all previously opened
                       ;; parents
                       (t (concat "/>\n"
                                  (org-html--make-string (- prev-level level)
                                                         "</topic>\n")))))
              ;; The topic line will be closed by the next entry
              (insert (format "<topic href=\"%s#%s\" label=\"%s\""
                              file href
                              (org-html-encode-plain-text text)))
              (setq prev-level level))
            ;; and the last entry needs to be closed explicitly, as well as any
            ;; remaining parents.
            (insert (concat "/>\n"
                            (org-html--make-string prev-level "</topic>\n")))))))
    ;; No TOC in HTML for eclipse-help
    ""))

(advice-add 'org-html-toc :around #'org-eclipse-build-toc)

;; This is a dirty one... we want the title to appear before the table of
;; contents.  Turns out that we also don't need the "Table of Contents" text, so
;; we use that spot!  The HTML export will call `org-html--translate' to get the
;; localized string, and we return the title of the file instead.
(advice-add 'org-html--translate :around
            (lambda (orig-fun s info)
              (if (string= s "Table of Contents")
                  (org-export-data (plist-get info :title) info)
                (funcall orig-fun s info))))

;; The default cache only cares about whether the source files have changed, but
;; does not check whether the /targets/ still exist.  So we have to use 'force
;; to make sure `publish' will in fact publish.  Why did you have to reinvent
;; make?
(org-publish-all 'force)

;; Now that the content has been written, close TOC file and write it to file.
(with-current-buffer toc-buffer
  (insert "</toc>\n")
  ;; Indent the buffer, because we have standards
  (let ((inhibit-message t))
    (nxml-mode)
    (indent-region (point-min) (point-max)))
  (write-region nil nil toc-file)
  (message "Wrote TOC file %s" toc-file))
