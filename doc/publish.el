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

(org-link-set-parameters "eclipse" :export #'org-eclipse-export)

(defun org-eclipse-export (path description backend)
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

;; At a later point, we can build the toc.xml from the contents of published
;; files.  Maybe piggy-backing on org-html-toc is not the best way.

;; (defvar all-headlines nil)

;; (defun org-eclipse-grab-headlines (text backend info)
;;   (message "HEADLINE %s" text))

;; (add-to-list 'org-export-filter-headline-functions
;;              #'org-eclipse-grab-headlines)

;; ;; Maybe with this hook?
;; (add-hook 'org-publish-after-publishing-hook

;; (defun org-eclipse-toc-text (toc-entries)
;;   "Return innards of a table of contents, as a string.
;; TOC-ENTRIES is an alist where key is an entry title, as a string,
;; and value is its relative level, as an integer."
;;   (let* ((prev-level (1- (cdar toc-entries)))
;; 	 (start-level prev-level))
;;     (concat
;;      (mapconcat
;;       (lambda (entry)
;; 	(let ((headline (car entry))
;; 	      (level (cdr entry)))
;; 	  (concat
;; 	   (let* ((cnt (- level prev-level))
;; 		  (times (if (> cnt 0) (1- cnt) (- cnt))))
;; 	     (setq prev-level level)
;; 	     (concat
;; 	      (org-html--make-string
;; 	       times (cond ((> cnt 0)
;; 			   ((< cnt 0) "</topic>\n")))
;; 	      (if (> cnt 0) "\n<ul>\n<li>" "</li>\n<li>")))
;; 	   headline)))
;;       toc-entries "")
;;      (org-html--make-string (- prev-level start-level) "</li>\n</ul>\n"))))

;; (defvar toc-file "org.atlanmod.emfviews.doc/toc.xml.new")

;; (defvar toc-contents "")

;; (with-temp-file toc-file
;;   (insert "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
;;           "<toc label=\"EMF Views Documentation\">"))

;; (advice-add 'org-html-toc :before
;;             (lambda (depth info &optional scope)
;;               (let ((toc-entries
;; 	             (mapcar (lambda (headline)
;; 		               (cons (org-export-data-with-backend
;; 		                      (org-export-get-alt-title headline info)
;; 		                      (org-export-toc-entry-backend 'html)
;; 		                      info)
;; 			             (org-export-get-relative-level headline info)))
;; 		             (org-export-collect-headlines info depth scope))))
;;                 (when toc-entries
;;                   (append-to-file (org-eclipse-toc-text toc-entries) nil (concat "../" toc-file))))))


;; The default cache only cares about whether the source files have changed, but
;; does not check whether the /targets/ still exist.  So we have to use 'force
;; to make sure `publish' will in fact publish.  Why did you have to reinvent
;; make?
(org-publish-all 'force)
