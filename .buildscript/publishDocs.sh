#!/usr/bin/env bash

SLUG="jaredsburrows/cs-interview-questions"
BRANCH="master"

if [ "$TRAVIS_REPO_SLUG" != "$SLUG" ]; then
    echo "Skipping: wrong repository. Expected '$SLUG' but was '$TRAVIS_REPO_SLUG'."
elif [ "$TRAVIS_PULL_REQUEST" != "false" ]; then
    echo "Skipping: was pull request."
elif [ "$TRAVIS_BRANCH" != "$BRANCH" ]; then
    echo "Skipping: wrong branch. Expected '$BRANCH' but was '$TRAVIS_BRANCH'."
elif [ "$TRAVIS_OS_NAME" !=  "linux" ]; then
    echo "Skipping: wrong os. Expected 'osx' but was '$TRAVIS_OS_NAME'."
else
    echo -e "Publishing docs...\n"

    # Generate docs
    ./gradlew clean asciidoc
    cp -R build/asciidoc/html5 $HOME/asciidoc-latest

    # Setup git and clone repo
    git config --global user.email "travis@travis-ci.org"
    git config --global user.name "travis-ci"
    cd $HOME
    git clone --quiet --branch=gh-pages https://${GH_TOKEN}@github.com/${SLUG} gh-pages &> /dev/null

    # Commit to the github pages branch
    cd gh-pages
    if [ -d "./docs" ]; then
        git rm -rf ./docs
    fi
    cp -Rf $HOME/asciidoc-latest ./docs
    git add -f .
    git commit -m "Publish docs from Travis CI build $TRAVIS_BUILD_NUMBER"
    git push -fq origin gh-pages > /dev/null

    echo -e "Published docs to gh-pages.\n"
fi
