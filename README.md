# QA Web Automation framework

This project is a web automation testing framework built using modern QA tools and best practices, intended for learning and portfolio purpose.

The framework follows a BDD approach using Cucumber and implements the Page Object Model design pattern.

---

## Tech stack

- Java 17
- Maven
- Selenium WebDriver
- Cucumber (BDD)
- JUnit platform
- Firefox
- WebDriverManager

---

## Project structure

src
└── test
|
├── java
| |
│ ├── pages # Page Object Model
| |
│ ├── stepdefinitions # Cucumber step definitions
| |
│ └── runners # Test runners and configuration
|
└── resources
|
└── features # Gherkin feature files

---

## Test target

The application under test is:

https://automationexercise.com

This site is commonly used for QA automation practice.

---

## Current test coverage

At the current stage, the framework includes:

- Basic navigation validation
- User signup flow
- Valitadion of existing email scenario
- Handling of popups and blocking overlays
- Explicit waits and JavaScript interactions

This test is intended as a proof of concept for frameworks structure.

---

## How to run the test

### Prerequisites
- Java 17 or higher
- Maven installed
- Firefox browser

### Run all test

```bash
mvn clean test
```