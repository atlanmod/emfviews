#!/bin/bash

set -e # Exit with nonzero exit code if anything fails

fold_start() {
  echo -e "travis_fold:start:$1\033[33;1m$2\033[0m"
}

fold_end() {
  echo -e "\ntravis_fold:end:$1\r"
}

fold_start deploy.1 "Deploy manual"
bash .travis/deploy-manual.sh
fold_end deploy.1

fold_start deploy.2 "Deploy update site"
bash .travis/deploy-update-site.sh
fold_end deploy.2
