#!/usr/bin/env bash

set -e

SLUG="jaredsburrows/cs-interview-questions"
BRANCH="master"
DIR=temp-clone

if [ "$TRAVIS_REPO_SLUG" != "$SLUG" ]; then
    echo "Skipping: wrong repository. Expected '$SLUG' but was '$TRAVIS_REPO_SLUG'."
elif [ "$TRAVIS_PULL_REQUEST" != "false" ]; then
    echo "Skipping: was pull request."
elif [ "$TRAVIS_BRANCH" != "$BRANCH" ]; then
    echo "Skipping: wrong branch. Expected '$BRANCH' but was '$TRAVIS_BRANCH'."
elif [ "$TRAVIS_OS_NAME" != "linux" ]; then
    echo "Skipping: wrong os. Expected 'osx' but was '$TRAVIS_OS_NAME'."
else
    echo -e "Publishing docs...\n"

    # Generate docs
    ./gradlew clean asciidoc
    cp -R build/asciidoc/html5/ asciidoc-latest/

    # Delete any existing temporary website clone
    rm -rf $DIR

    # Clone the current repo into temp folder
    git config --global user.email "travis@travis-ci.org"
    git config --global user.name "travis-ci"
    git clone --quiet https://${GH_TOKEN}@github.com/${SLUG} $DIR &> /dev/null

    # Move working directory into temp folder
    cd $DIR

    # Checkout and track the gh-pages branch
    git checkout -t origin/gh-pages

    # Delete everything
    rm -rf *

    # Copy website files from real repo
    cp -R ../asciidoc-latest/* .

    # Stage all files in git and create a commit
    git add .
    git add -u
    git commit -m "Website at $(date)"

    # Push the new files up to GitHub
    git push -fq origin gh-pages > /dev/null

    # Delete our temp folder
    rm -rf ../$DIR

    echo -e "Published docs to gh-pages.\n"
fi
