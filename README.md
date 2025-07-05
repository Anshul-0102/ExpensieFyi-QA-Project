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
.
├── manual/                  # Test Plan, Test Cases
├── automation/
│   ├── cypress/             # Cypress Tests
│   └── selenium/            # Selenium Tests (Java)
├── ai/                      # AI Test Case Summarizer
├── bugs/                    # Bug Reports
├── assets/                  # Screenshots
└── README.md
```

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
