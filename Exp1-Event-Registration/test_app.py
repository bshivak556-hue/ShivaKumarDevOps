import unittest
from app import app

class EventRegistrationTests(unittest.TestCase):
    def setUp(self):
        app.config["TESTING"] = True
        self.client = app.test_client()

    def test_home_page_loads(self):
        response = self.client.get("/")
        self.assertEqual(response.status_code, 200)
        self.assertIn(b"College Event Registration", response.data)

    def test_successful_registration(self):
        response = self.client.post("/register", data={
            "name": "Akhil", "email": "akhil@example.com", "event": "Hackathon"
        })
        self.assertEqual(response.status_code, 200)
        self.assertIn(b"Registration successful", response.data)
        self.assertIn(b"Hackathon", response.data)

    def test_missing_field_is_rejected(self):
        response = self.client.post("/register", data={
            "name": "Akhil", "email": "", "event": "Hackathon"
        })
        self.assertEqual(response.status_code, 400)

if __name__ == "__main__":
    unittest.main()
