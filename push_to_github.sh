#!/bin/bash

# Exit on error
set -e

echo "=== Giri Tech Hub Git & GitHub CLI Push & Clean Script ==="

# Check if git is installed
if ! command -v git &> /dev/null; then
    echo "Error: git is not installed. Please install git first."
    exit 1
fi

# Check if gh CLI is installed
if ! command -v gh &> /dev/null; then
    echo "Error: gh (GitHub CLI) is not installed. Please install it first."
    exit 1
fi

# Initialize git repository if not already done
if [ ! -d .git ]; then
    echo "Initializing git repository..."
    git init
    git branch -M main
else
    echo "Git repository already initialized."
fi

# Check GitHub authentication status
echo "Checking GitHub authentication status..."
if ! gh auth status &> /dev/null; then
    echo "--------------------------------------------------------"
    echo "WARNING: You are not logged in to GitHub via gh CLI."
    echo "Please run:  gh auth login"
    echo "and then run this script again."
    echo "--------------------------------------------------------"
    exit 1
fi

# Stage files (including our subfolder)
echo "Staging files..."
git add .gitignore "Day 1 : May 18 2026/"

# Commit changes
echo "Committing files..."
git commit -m "Day 1: May 18 2026 Java programs" || echo "No changes to commit or already committed."

# Create GitHub repository if it doesn't exist
REPO_NAME="Giri-Tech-Hub"
echo "Checking if repository $REPO_NAME exists on GitHub..."
if ! gh repo view "$REPO_NAME" &> /dev/null; then
    echo "Creating new public repository '$REPO_NAME' on GitHub..."
    gh repo create "$REPO_NAME" --public --source=. --remote=origin
else
    echo "Repository '$REPO_NAME' already exists on GitHub."
    # Ensure remote origin is set
    if ! git remote | grep -q "origin"; then
        USER_NAME=$(gh api user -q .login)
        echo "Setting remote origin..."
        git remote add origin "https://github.com/$USER_NAME/$REPO_NAME.git"
    fi
fi

# Push to main branch
echo "Pushing code to GitHub..."
git push -u origin main

# Clean up original files from the root directory (keeping them safe in the Day 1 subfolder)
echo "Cleaning up root directory..."
rm -f q1.java q2.java q3.java q4.java q5.java q6.java q7.java q8.java q9.java q10.java q11.java q12.java q13.java q14.java q15.java q16.java q17.java q18.java
rm -f q1.class q2.class q3.class q4.class q5.class q6.class q7.class q8.class q9.class q10.class q11.class q12.class q13.class q14.class q15.class q16.class q17.class q18.class

echo "=== Success! Repository created, codes pushed, and root directory cleaned! ==="
