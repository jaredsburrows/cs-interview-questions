#!/usr/bin/env bash

set -e

SLUG="jaredsburrows/cs-interview-questions"
BRANCH="master"

# Delete any existing temporary website clone
rm -rf temp-clone
rm -rf asciidoc-latest

# Generate docs
./gradlew clean asciidoc
cp -R build/asciidoc/html5/ asciidoc-latest/

# Clone the current repo into temp folder
git config --global user.email "action@github.com"
git config --global user.name "Github Actions"
git clone --quiet https://${GH_TOKEN}@github.com/${SLUG} temp-clone &> /dev/null

# Move working directory into temp folder
cd temp-clone

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
rm -rf ../temp-clone

echo -e "Published docs to gh-pages.\n"
