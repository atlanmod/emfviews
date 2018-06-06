;; Use the built-in Org version
(require 'org)
(require 'ox)

;; Custom links
(defun org-eclipse-export (path description backend)
  "Create link for export."
  (format "<a href=\"http://help.eclipse.org/oxygen/nav/34\">%s</a>" description))

(org-link-set-parameters
 "eclipse"
 :export #'org-eclipse-export)

;; Export setup
(setq org-publish-project-alist
      '(("manual"
         :base-directory "src/"
         :publishing-directory "org.atlanmod.emfviews.doc/html/"
         :publishing-function org-html-publish-to-html)

        ("images"
         :base-directory "src/images/"
         :base-extension "jpg\\|gif\\|png"
         :publishing-directory "org.atlanmod.emfviews.doc/html/images/"
         :publishing-function org-publish-attachment)

        ("stylesheet"
         :base-directory "src/"
         :base-extension "css"
         :publishing-directory "org.atlanmod.emfviews.doc/html/"
         :publishing-function org-publish-attachment))

      org-export-with-section-numbers nil
      org-html-htmlize-output-type nil    ; no styling of code blocks for now
      org-html-postamble nil              ; no postamble
      org-html-doctype "html5"
      org-html-viewport nil                   ; no viewport directive
      org-html-head-include-scripts nil       ; no JS
      org-html-head-include-default-style nil ; no inline CSS
      org-html-head "<link rel=\"stylesheet\" href=\"style.css\">")

;; For some reason, org-publish will create backup files
(setq make-backup-files nil)

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
;; not if the targets still exist.  Why do you have to reinvent make?
(org-publish-all)
