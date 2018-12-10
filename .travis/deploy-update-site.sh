#!/bin/bash

# Deploy the EMF Views update-site by committing on top of the master branch of
# atlanmod/updates, *without* preserving history.

DEPLOY_REPO='https://github.com/atlanmod/updates'
TARGET_BRANCH="master"
KEEP_HISTORY=false
SRC_FOLDER="update/target/repository"
DEST_FOLDER="emfviews/snapshot"
DEPLOY_KEY="deploy-key-updates"

OUT_DIR="out-updates"
ENCRYPTION_LABEL="b7b263ca9d8b"
COMMIT_AUTHOR_NAME="Travis CI"
COMMIT_AUTHOR_EMAIL="deploy@travis.org"

bash safe-deploy
