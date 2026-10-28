# Experiment 4 — Jenkins Installation and Setup

## Objective
Install Jenkins, complete the initial setup, create a job, and verify that Jenkins can run a build.

## Setup checklist
1. Install a supported Java JDK and verify with `java -version`.
2. Install Jenkins using the official installation guide for your operating system.
3. Start the Jenkins service and open `http://localhost:8080` (or the port configured on your machine).
4. Unlock Jenkins using the initial admin password shown by the installer/log.
5. Install suggested plugins and create an administrator account.
6. Create **New Item → Freestyle project** named `setup-check`.
7. Under Build Steps, add **Execute Windows batch command** with `echo Jenkins is working` on Windows, or **Execute shell** with `echo "Jenkins is working"` on Linux/macOS.
8. Click **Build Now**, then open **Console Output**.

## Verification commands
Windows PowerShell:
```powershell
java -version
Get-Service jenkins
Test-NetConnection localhost -Port 8080
```
If your Jenkins runs on port 8081, replace 8080 with 8081.

## Expected result
The build finishes with `Finished: SUCCESS` and the console includes `Jenkins is working`.

## References
Use the official Jenkins installation instructions for your OS and the Jenkins Pipeline documentation linked from the main project README.
