# Experiment 5 — Continuous Integration using Jenkins and Java (No Maven)

## Files
`HelloDevOps.java` is the Java program. `Jenkinsfile` compiles it with `javac`, runs it, and executes a simple assertion-based test. This experiment deliberately does not require Maven.

## Local test (Windows PowerShell)
```powershell
javac HelloDevOps.java
java HelloDevOps
java HelloDevOps --test
```
Expected lines:
```text
Hello from Jenkins CI!
Hello from Jenkins CI!
TEST PASSED
```
(The second and third lines appear when running with `--test`.)

## Jenkins pipeline
1. Ensure Java JDK is installed on the Jenkins agent and `java`/`javac` are on PATH.
2. Put these files in a Git repository and push to GitHub.
3. In Jenkins choose **New Item → Pipeline**.
4. Select **Pipeline script from SCM**, SCM **Git**, enter the repository URL, branch `*/main`, and script path `Exp5-Jenkins-CI/Jenkinsfile` if the repository root contains all experiments.
5. If your Jenkins agent is Linux, change each `bat '...'` step to an equivalent `sh '...'` step.
6. Click **Build Now** and inspect Console Output.

## Expected result
The pipeline has Check Java, Compile, and Run and Test stages and finishes with `SUCCESS` when the JDK and agent are configured correctly.
