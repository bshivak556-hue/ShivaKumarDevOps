@echo off
echo Jenkins setup verification
java -version
echo If Jenkins is installed as a Windows service, check it in Services or run: sc query jenkins
echo Open the configured Jenkins URL in a browser and run a test build.
