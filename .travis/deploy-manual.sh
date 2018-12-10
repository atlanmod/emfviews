#!/bin/bash

# Deploy the built EMF Views manual by committing on top of the gh-pages branch,
# preserving history.

DEPLOY_REPO=`git config remote.origin.url`
TARGET_BRANCH="gh-pages"
KEEP_HISTORY=true
SRC_FOLDER="doc/html"
DEST_FOLDER="manual"
DEPLOY_KEY="deploy-key-manual"

OUT_DIR="out-manual"
ENCRYPTION_LABEL="b7b263ca9d8b"
COMMIT_AUTHOR_NAME="Travis CI"
COMMIT_AUTHOR_EMAIL="deploy@travis.org"
