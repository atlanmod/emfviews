#!/bin/bash

# Deploy the EMF Views update-site by committing on top of the master branch of
# atlanmod/updates, *without* preserving history.
#
# This script is essentially the same as deploy-manual, and has all these steps
# for the exact same reasons.

set -e # Exit with nonzero exit code if anything fails

TARGET_BRANCH="master"
COMMIT_AUTHOR_EMAIL="deploy@travis.org"
REPO='https://github.com/atlanmod/updates'
OUT_DIR="out-updates"
ENCRYPTION_LABEL="b7b263ca9d8b"

# Save some useful information
SSH_REPO=${REPO/https:\/\/github.com\//git@github.com:}
SHA=`git rev-parse --verify HEAD`
TARGET_BRANCH_TEMP="master-temp"

echo Deploying update site to $REPO on branch $TARGET_BRANCH ...

# Clone the existing target branch for this repo into out/
# Always create a new orphan branch
git clone $REPO $OUT_DIR
cd $OUT_DIR
git checkout --orphan $TARGET_BRANCH_TEMP
cd ..

# Clean out existing contents
rm -rf $OUT_DIR/emfviews/**/* || exit 0

# Copy built update site to out
# The '/.' copies the 'repository' folder *contents*.
cp -r update/target/repository/. $OUT_DIR/emfviews/snapshot

# Now let's go have some fun with the cloned repo
cd $OUT_DIR
git config user.name "Travis CI"
git config user.email "$COMMIT_AUTHOR_EMAIL"

# If there are no changes to the compiled out (e.g. this is a README update)
# then just bail.
git add -N .
if git diff --quiet; then
    echo "No changes to the output on this push; exiting."
    exit 0
fi

# Commit the "changes", i.e. the new version.
# The delta will show diffs between new and old versions.
git add -A .
git commit -m "Deploy to GitHub Pages: ${SHA}"

# Get the deploy key by using Travis's stored variables to decrypt deploy-key.enc
ENCRYPTED_KEY_VAR="encrypted_${ENCRYPTION_LABEL}_key"
ENCRYPTED_IV_VAR="encrypted_${ENCRYPTION_LABEL}_iv"
ENCRYPTED_KEY=${!ENCRYPTED_KEY_VAR}
ENCRYPTED_IV=${!ENCRYPTED_IV_VAR}
openssl aes-256-cbc -K $ENCRYPTED_KEY -iv $ENCRYPTED_IV -in ../.travis/deploy-key-updates.enc -out ../.travis/deploy-key-updates -d
chmod 600 ../.travis/deploy-key-updates
eval `ssh-agent -s`
ssh-add ../.travis/deploy-key-updates

# Git LFS will fail with "You must have push access to verify locks" here.
# Since for the deployment we don't actually touch the LFS, the workaround is
# just to remove the pre-push hook that triggers LFS.
# See https://github.com/git-lfs/git-lfs/issues/2284
rm --force .git/hooks/pre-push

# Now that we're all set up, we can push.  Using `--force` to ensure we erase
# history on the remote branch.
git push --force $SSH_REPO ${TARGET_BRANCH_TEMP}:${TARGET_BRANCH}
