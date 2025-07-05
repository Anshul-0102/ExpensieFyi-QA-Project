# Expense.fyi – End-to-End QA Project 🚀

This is a **full-stack QA project** for the open-source [Expense.fyi](https://expense.fyi) app, combining **manual testing, automation (Cypress + Selenium), and an AI-powered test summarizer**.

---

## 📚 Table of Contents
- [Project Overview](#project-overview)
- [Tools & Tech Stack](#tools--tech-stack)
- [Folder Structure](#folder-structure)
- [Manual Testing](#manual-testing)
- [Automation](#automation)
- [AI Integration](#ai-integration)
- [Screenshots](#screenshots)
- [How to Run](#how-to-run)
- [Resume Highlights](#resume-highlights)

---

## 🚩 Project Overview
This project simulates a QA internship challenge for a web-based expense tracker. The goal is to validate login, group creation, expense addition, and dashboard calculations.

---

## 🛠 Tools & Tech Stack
- **Manual Testing:** Excel, Test Plans, Bug Reports
- **Automation Testing:** Cypress (JavaScript), Selenium (Java + TestNG)
- **AI Utility:** Python-based Test Case Summarizer
- **Reporting:** Excel, Markdown

---

## 📂 Folder Structure
```bash
ExpenseFyi-QA-Complete/
├── .idea/                                 # IntelliJ project settings (optional)
├── src/
│   └── test/java/
│       └── LoginTest.java                 # Selenium automated UI test (Java + TestNG)
├── postman/
│   └── expensefyi-api-tests.json          # Postman collection (for future REST API testing)
├── automation/
│   ├── cypress/
│   │   └── login.spec.js                  # Cypress test for login workflow
│   └── selenium/
│       └── LoginTest.java                 # Selenium test (duplicate for isolated run)
├── ai/
│   └── test_case_summarizer.py            # AI script to summarize test case coverage
├── manual-test-cases/
│   └── Manual_Test_Cases_QA_Project.xlsx  # 40+ filled manual test cases
├── bugs/
│   └── Bug_Report.xlsx                    # Bug log with severity, module, and reproducibility
├── test-plan/
│   └── TestPlan.md                        # Multi-section test plan document
├── assets/
│   └── screenshots/                       # Screenshots for evidence or UI validation
├── pom.xml                                # Maven configuration for Selenium
└── README.md                              # Full project guide, execution instructions, resume notes


---

## 📝 Manual Testing
- 📄 Detailed **Test Plan** (multi-section)
- 🗂️ **40+ Functional & Negative Test Cases**
- 🐞 Realistic **Bug Reports** (Excel)

---

## 🤖 AI Integration
### `test_case_summarizer.py`
A Python script that scans test case files and generates quick summaries to help QA teams prioritize.

---

## 🧪 Automation
- ✅ Cypress: Login test with validation
- ✅ Selenium: Login POM test using TestNG

---

## 🖼️ Screenshots
Screenshots are placed in the `assets/` folder and referenced in the test evidence.

---

## 🚀 How to Run
### Cypress
```bash
cd automation/cypress
npx cypress open
```

### Selenium
Import `LoginTest.java` in Eclipse/IntelliJ with Selenium dependencies and run.

### AI Utility
```bash
cd ai
python test_case_summarizer.py
```

---

## 💼 Resume Highlights
- ✅ Designed 40+ test cases for a real app
- ✅ Combined manual & automation testing
- ✅ Integrated AI to enhance QA workflows
- ✅ Used industry-standard tools: Cypress, Selenium, Python, Jira-style documentation

✅ Features
Web UI Tests (Selenium + TestNG)
Valid login
Invalid login
Logout functionality
Access to protected page after login
API Tests (Postman)
GET /posts → status 200 + 100 items
GET /posts/1 → valid response
POST /posts → post creation
PUT /posts/1 → post update
DELETE /posts/1 → deletion
Manual Test Cases (Excel)
5+ clear test cases with steps, expected results, and status
Covers login, logout, API calls
▶️ How to Run Automated Tests
Clone the repository:
git clone https://github.com/YOUR_USERNAME/qa-demo-automation-testing.git
cd qa-demo-automation-testing
Run tests:
mvn test
Make sure you have Java, Maven, and ChromeDriver installed and configured in PATH.

🧾 Manual Testing
Open the Excel file:

/manual-test-cases/Manual_Test_Cases_QA_Project.xlsx
🔗 Postman API Collection
Open Postman
Import file:
/postman/jsonplaceholder-tests.json
Run the collection or use Collection Runner
🧪 API Automated Tests (RestAssured)
These tests are written in Java using the RestAssured library and TestNG.

✅ Test 1 – GET /posts/1
Verifies status code is 200
Checks if body contains userId, title, and body
✅ Test 2 – POST /posts
Sends a new post with title, body, and userId
Verifies status code 201
Confirms the response contains sent values
