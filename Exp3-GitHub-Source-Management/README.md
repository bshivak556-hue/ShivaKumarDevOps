# Experiment 3 — Source Code Management using GitHub

## Objective
Manage source code in Git, track versions, create a feature branch, and publish the repository.

## Practical
```bash
git init
git add .
git commit -m "Add sample source code"
git switch -c feature-greeting
```
Edit `src/greeting.py`, then:
```bash
git add src/greeting.py
git commit -m "Improve greeting"
git switch main
git merge feature-greeting
git log --oneline --all --graph
```
Create an empty repository on GitHub and connect it:
```bash
git remote add origin https://github.com/YOUR_USERNAME/YOUR_REPOSITORY.git
git branch -M main
git push -u origin main
```

## Expected result
The source file is tracked by Git, commits appear in history, and the repository can be pushed to GitHub. GitHub webhooks are optional and are not configured by this experiment.
