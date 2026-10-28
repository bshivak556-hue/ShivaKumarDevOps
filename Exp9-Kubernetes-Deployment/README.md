# Experiment 9 — Deploy a Containerized App using Kubernetes

## Prerequisites
A running cluster (`kubectl get nodes` succeeds) and an image published to Docker Hub. Build/push the app from `../Exp7-Dockerized-Application` first.

## Configure image
Open `deployment.yaml` and replace `YOUR_DOCKERHUB_USERNAME` with your actual Docker Hub username.

## Deploy
```bash
kubectl apply -f deployment.yaml
kubectl apply -f service.yaml
kubectl rollout status deployment/devops-hello
kubectl get deployments,pods,services
```

## Test access
- Minikube: `minikube service devops-hello --url`
- Docker Desktop Kubernetes: open `http://localhost:30800/` if NodePort is available on your setup.
- If the endpoint is unreachable, inspect `kubectl describe pod POD_NAME` and `kubectl logs POD_NAME`.

Expected response:
```json
{"message": "Hello from a Docker container!", "status": "ok"}
```

## Remove resources
```bash
kubectl delete -f service.yaml
kubectl delete -f deployment.yaml
```
