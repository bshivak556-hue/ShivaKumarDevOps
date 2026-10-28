# Experiment 12 — Selenium Test for a Containerized Web App

## Prerequisites
Docker Desktop, Java 17+, Maven, Chrome/Chromium. The Flask app source is in `../Exp1-Event-Registration`.

## 1. Start the application container
In a terminal:
```bash
cd ../Exp1-Event-Registration
docker build -t event-registration:1.0 .
docker run --rm --name event-registration-test -p 5000:5000 event-registration:1.0
```
Keep this terminal running.

## 2. Run Selenium tests
Open another terminal and go to this folder:
```bash
cd Exp12-Selenium-Container-App
mvn test
```
If the app runs at another URL, use:
```bash
mvn test -Dapp.url=http://localhost:5000
```

## Expected result
The Selenium test opens the app in headless Chrome, fills the form, submits it, and verifies the confirmation text. Maven should report one passing test. The first Selenium run may need internet access for driver resolution.
