#!/bin/bash

set -e # Exit with nonzero exit code if anything fails

# These add nice folds in the Travis log
fold_start() {
  echo -e "travis_fold:start:$1\033[33;1m$2\033[0m"
}

fold_end() {
  echo -e "\ntravis_fold:end:$1\r"
}

export ENCRYPTION_LABEL="b7b263ca9d8b"
export COMMIT_AUTHOR_NAME="Travis CI"
export COMMIT_AUTHOR_EMAIL="deploy@travis.org"

fold_start deploy.manual "Deploy manual"
bash .travis/deploy-manual.sh
fold_end deploy.manual

fold_start deploy.updates "Deploy update site"
bash .travis/deploy-update-site.sh
fold_end deploy.updates
