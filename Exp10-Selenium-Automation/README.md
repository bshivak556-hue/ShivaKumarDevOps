# Experiment 10 — Automated Web Testing using Selenium and Java

## Prerequisites
Java JDK 17+, Maven, Google Chrome/Chromium. Selenium Manager (included with modern Selenium) normally resolves the compatible driver automatically; the first run may need internet access to download it.

## Run
From this folder:
```bash
mvn test
```
The test opens a local HTML page in headless Chrome, checks the heading, clicks a button, and verifies the heading changed.

## Expected result
Maven reports `BUILD SUCCESS` and `Tests run: 1, Failures: 0, Errors: 0`. If Chrome cannot start, confirm Chrome is installed and try running Chrome normally before retrying.
