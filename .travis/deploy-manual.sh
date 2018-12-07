#!/bin/bash

# Deploy the built EMF Views manual by committing on top of the gh-pages branch,
# preserving history.
#
# Ok so in theory we should just be able to use the Travis baked-in deployment
# to pages: https://docs.travis-ci.com/user/deployment/pages/
#
# But it is insecure.  If you follow it, you will generate a Github access token
# (with wide permissions for *other* repositories), and this token can be
# accessed by collaborators.
#
# Instead, we follow this gist:
# https://gist.github.com/domenic/ec8b0fc8ab45f39403dd
#
# which generates a deployment key pair that can only be used to push for the
# emfviews repository.

set -e # Exit with nonzero exit code if anything fails

TARGET_BRANCH="gh-pages"
COMMIT_AUTHOR_EMAIL="deploy@travis.org"

# Save some useful information
REPO=`git config remote.origin.url`
SSH_REPO=${REPO/https:\/\/github.com\//git@github.com:}
SHA=`git rev-parse --verify HEAD`

# Clone the existing gh-pages for this repo into out/
# Create a new empty branch if gh-pages doesn't exist yet (should only happen on
# first deploy)
git clone $REPO out
cd out
git checkout $TARGET_BRANCH || git checkout --orphan $TARGET_BRANCH
cd ..

# Clean out existing contents
rm -rf out/manual/**/* || exit 0

# Copy built manual to out
# The '/.' copies the html folder *contents*.
cp -r doc/html/. out/manual

# Now let's go have some fun with the cloned repo
cd out
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

# Get the deploy key by using Travis's stored variables to decrypt deploy_key.enc
ENCRYPTED_KEY_VAR="encrypted_${ENCRYPTION_LABEL}_key"
ENCRYPTED_IV_VAR="encrypted_${ENCRYPTION_LABEL}_iv"
ENCRYPTED_KEY=${!ENCRYPTED_KEY_VAR}
ENCRYPTED_IV=${!ENCRYPTED_IV_VAR}
openssl aes-256-cbc -K $ENCRYPTED_KEY -iv $ENCRYPTED_IV -in ../.travis/deploy-key-emfviews.enc -out ../.travis/deploy-key-emfviews -d
chmod 600 ../.travis/deploy-key-emfviews
eval `ssh-agent -s`
ssh-add ../.travis/deploy-key-emfviews

# Git LFS will fail with "You must have push access to verify locks" here.
# Since for the deployment we don't actually touch the LFS, the workaround is
# just to remove the pre-push hook that triggers LFS.
# See https://github.com/git-lfs/git-lfs/issues/2284
rm .git/hooks/pre-push

# Now that we're all set up, we can push.
git push $SSH_REPO $TARGET_BRANCH
