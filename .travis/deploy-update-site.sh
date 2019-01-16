#!/bin/bash

# Deploy the EMF Views update-site by committing on top of the master branch of
# atlanmod/updates, *without* preserving history.  We do not want to preserve
# history because we don't need more than one snapshot build on the update
# site, and we don't want to pollute the repo history with old JARs.

export DEPLOY_REPO='https://github.com/atlanmod/updates'
export TARGET_BRANCH="master"
export KEEP_HISTORY=false
export SRC_FOLDER="update/target/repository"
export DEST_FOLDER="emfviews/snapshot"
export DEPLOY_KEY="deploy-key-updates"

export OUT_DIR="out-updates"

# Add an index.html that instructs users browing the update site URL in a
# browser to use it in Eclipse instead.

cp update/target/static/* ${DEST_FOLDER}/

bash .travis/safe-deploy.sh
