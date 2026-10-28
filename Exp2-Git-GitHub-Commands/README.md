# Experiment 2 — Git and GitHub Commands

## Objective
Practice creating a repository, staging changes, committing, branching, merging, inspecting history, and pushing to GitHub.

## Commands (run from this folder)
```bash
git init
git status
git add .
git commit -m "First commit"
git branch feature-demo
git switch feature-demo
```
Create or edit `practice.txt`, then:
```bash
git add practice.txt
git commit -m "Add practice file"
git switch main
git merge feature-demo
git log --oneline --graph --all
```
To connect an empty GitHub repository:
```bash
git remote add origin https://github.com/YOUR_USERNAME/YOUR_REPOSITORY.git
git push -u origin main
```
If your default branch is `master`, use `git branch -M main` before pushing.

## Windows helper
Run `.\git-practice.ps1` in PowerShell to print the recommended commands. It does not execute them automatically.

## Expected result
`git status` shows the working tree is clean after commits; `git log --oneline` lists your commits. Pushing uploads commits to the remote repository.
