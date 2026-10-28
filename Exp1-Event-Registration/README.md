# Experiment 1 — Event Registration Form using Flask and Docker

## Files
`app.py` contains the Flask routes, `templates/` contains the form and confirmation pages, `test_app.py` tests the routes, and `Dockerfile` packages the app.

## Run locally (PowerShell)
```powershell
cd Exp1-Event-Registration
py -m venv .venv
.\.venv\Scripts\Activate.ps1
python -m pip install -r requirements.txt
python -m unittest -v
python app.py
```
Open `http://127.0.0.1:5000`, submit the form, and confirm the success page appears.

## Run with Docker
From this folder:
```bash
docker build -t event-registration:1.0 .
docker run --rm -p 5000:5000 event-registration:1.0
```
Open `http://localhost:5000`.

## Expected result
The home page displays a registration form. A valid submission shows “Registration successful!” with the selected event. The unit tests should report 3 tests passing.
