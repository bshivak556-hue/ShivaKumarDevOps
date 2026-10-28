# Experiment 8 — Integrate Docker and Kubernetes

## Objective
Build an application image with Docker, publish it to a registry, and deploy it to Kubernetes.

## 1. Build and test the app image
```bash
cd ../Exp7-Dockerized-Application
docker build -t YOUR_DOCKERHUB_USERNAME/devops-hello:1.0 .
docker run --rm -p 8000:8000 YOUR_DOCKERHUB_USERNAME/devops-hello:1.0
```
Test `http://localhost:8000/`, then stop it with Ctrl+C.

## 2. Publish the image
```bash
docker login
docker push YOUR_DOCKERHUB_USERNAME/devops-hello:1.0
```
Replace the username placeholder. Do not put your Docker Hub password/token in this repository.

## 3. Enable a Kubernetes cluster
Start Kubernetes in Docker Desktop or start Minikube:
```bash
minikube start
```
Check:
```bash
kubectl get nodes
```

## 4. Apply the sample manifest
Edit `deployment.yaml` and replace `YOUR_DOCKERHUB_USERNAME` with your Docker Hub username:
```bash
kubectl apply -f deployment.yaml
kubectl apply -f service.yaml
kubectl get deployments
kubectl get pods
kubectl get services
```
For local Minikube, run `minikube service devops-hello --url` to get a reachable URL. On Docker Desktop, use the NodePort shown by the service.

## Expected result
A Deployment creates a pod using the published image, and the application returns JSON at `/` and `/health`. Kubernetes commands require a running cluster and an image accessible to that cluster.
