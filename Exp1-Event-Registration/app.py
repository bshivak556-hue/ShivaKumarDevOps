from flask import Flask, render_template, request

app = Flask(__name__)

@app.get("/")
def index():
    return render_template("register.html")

@app.post("/register")
def register():
    name = request.form.get("name", "").strip()
    email = request.form.get("email", "").strip()
    event = request.form.get("event", "").strip()
    if not name or not email or not event:
        return render_template("register.html", error="Please complete every field."), 400
    return render_template("success.html", name=name, email=email, event=event)

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5000, debug=False)
