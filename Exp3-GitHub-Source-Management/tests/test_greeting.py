import unittest
from src.greeting import greeting

class GreetingTests(unittest.TestCase):
    def test_default_greeting(self):
        self.assertIn("DevOps learner", greeting())

    def test_custom_greeting(self):
        self.assertEqual(greeting("GitHub"), "Hello, GitHub! Source control keeps every change traceable.")

if __name__ == "__main__":
    unittest.main()
