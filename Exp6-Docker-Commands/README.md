# Experiment 6 — Docker Commands for Image and Container Management

## Prerequisite
Install and start Docker Desktop (Windows/macOS) or Docker Engine (Linux). Verify with `docker version`.

## Practical command sequence
```bash
docker version
docker info
docker pull hello-world
docker images
docker run --rm hello-world
docker ps
docker ps -a
docker run -d --name web-demo -p 8085:80 nginx:alpine
docker ps
docker logs web-demo
docker stop web-demo
docker rm web-demo
docker rmi hello-world
```
`docker rmi hello-world` may report that the image is still used by a container; remove stopped containers first if needed.

## Image build example
From `../Exp7-Dockerized-Application`:
```bash
docker build -t devops-hello:1.0 .
docker run --rm -p 8086:8000 devops-hello:1.0
```
Open `http://localhost:8086`.

## Expected results
- `docker images` lists downloaded/built images.
- `docker ps` lists running containers.
- `docker logs web-demo` shows container logs.
- `docker stop` stops the container; `docker rm` removes it.

## Safe cleanup
Only remove containers/images created for this lab. Do not run broad prune commands if you have other Docker projects you need to keep.
