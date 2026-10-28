# Experiment 7 — Containerize a Python Hello World Web App

## Build and run
From this folder:
```bash
docker build -t devops-hello:1.0 .
docker run --rm --name devops-hello -p 8000:8000 devops-hello:1.0
```
In another terminal:
```bash
curl http://localhost:8000/
curl http://localhost:8000/health
```
Or open `http://localhost:8000` in a browser.

## Expected response
```json
{"message": "Hello from a Docker container!", "status": "ok"}
```
Stop the container with `Ctrl+C` in the terminal where it is running. This server stays alive, so it is suitable for a Kubernetes Deployment.
