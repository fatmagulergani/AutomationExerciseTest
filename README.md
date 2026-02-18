# 🛒 Automation Exercise - E2E Test Suite

A comprehensive **End-to-End (E2E) Automation** project built to test the core functionalities of an e-commerce platform. This project demonstrates the ability to automate complex user journeys such as user registration, product search, and checkout processes.

## 🛠️ Technology Stack
* **Language:** Java (JDK 11+)
* **Automation Tool:** Selenium WebDriver
* **Test Framework:** TestNG
* **Build Tool:** Maven
* **Design Pattern:** Page Object Model (POM)

## ✨ Key Features
- **Full User Journey Coverage:** Automates critical paths including Signup, Login, Cart Management, and Payment.
- **Robust Assertions:** Uses soft and hard assertions to verify UI elements and business logic at every step.
- **Maintainable Architecture:** Implements Page Object Model to minimize code duplication and simplify maintenance.
- **Custom Utilities:** Includes reusable methods for common actions like handling dropdowns, pop-ups, and explicit waits.

## 📂 Project Structure

```text
src
├── main
├── test
│    └── java
│         ├── pages       (Page Objects)
│         ├── tests       (Test Cases)
│         └── utilities   (Driver, ConfigReader)
└── pom.xml
└── README.md
```

## 🚀 How to Run Tests

```bash
# Clone the repository
git clone https://github.com/fatmagulergani/AutomationExerciseTest.git

# Navigate to the project folder
cd AutomationExerciseTest

# Run the tests
mvn clean test
```
---

📫 **Contact:** https://www.linkedin.com/in/fatmagul-ergani-yalcin/