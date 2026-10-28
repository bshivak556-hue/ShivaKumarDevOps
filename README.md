
# DevOps Lab — All 12 Experiments

This repository groups the 12 experiments into one project. Each experiment folder includes practical files, commands, and expected results where appropriate.

## Before you start
Install only the tools required for the experiment you are running:
- Git and a GitHub account
- Python 3.10+ and pip (Experiments 1 and 7)
- Docker Desktop (Experiments 1, 6, 7, 8, 9, 12)
- Java JDK 17+ (Experiments 4, 5, 10, 11, 12)
- Jenkins (Experiments 4 and 5)
- Maven (Experiments 10–12)
- Kubernetes via Docker Desktop, Minikube, or another cluster (Experiments 8–9)
- Chrome or Chromium for Selenium experiments

## Folder map
1. `Exp1-Event-Registration` — Flask event registration app, tests, Dockerfile
2. `Exp2-Git-GitHub-Commands` — Git practice commands and scripts
3. `Exp3-GitHub-Source-Management` — sample source repository and Git workflow
4. `Exp4-Jenkins-Setup` — Jenkins setup checklist and verification
5. `Exp5-Jenkins-CI` — Java compile/run/test pipeline without Maven
6. `Exp6-Docker-Commands` — Docker command lab and sample outputs
7. `Exp7-Dockerized-Application` — persistent Python HTTP application in Docker
8. `Exp8-Docker-Kubernetes` — image build/push and Kubernetes practice manifests
9. `Exp9-Kubernetes-Deployment` — Kubernetes Deployment + NodePort Service
10. `Exp10-Selenium-Automation` — Java Selenium test for a local HTML page
11. `Exp11-JavaScript-Selenium` — browser counter app + Selenium test
12. `Exp12-Selenium-Container-App` — Selenium test against the Flask app running in Docker

## Important
- Expected outputs are examples of what a successful run should look like; they are not claims that every experiment was executed on your computer.
- Docker, Jenkins, Maven, Chrome, and Kubernetes require local installation/configuration. Read each experiment's README before running it.
- For experiments that publish a Docker image, replace `YOUR_DOCKERHUB_USERNAME` with your own Docker Hub username.
- Never commit passwords, access tokens, or other secrets to GitHub.

## Push the complete project to your repository
From this folder, open PowerShell or a terminal and run:

```bash
git init
git add .
git commit -m "Add all 12 DevOps lab experiments"
git branch -M main
git remote add origin https://github.com/Akhil77728/Devops-all-experiments-.git
git push -u origin main
```

If the folder is already a Git repository, do not run `git init` or add the remote again. Use `git status`, then `git add .`, `git commit -m "Improve practical files for all experiments"`, and `git push`.
