Write-Host "Java version:"
java -version
Write-Host "`nJenkins service status:"
Get-Service jenkins -ErrorAction SilentlyContinue
Write-Host "`nTesting common Jenkins ports:"
Test-NetConnection localhost -Port 8080
Test-NetConnection localhost -Port 8081
