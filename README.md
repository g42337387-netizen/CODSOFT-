# CODSOFT Java Programs

This repository contains a collection of Java programs developed as part of the CODSOFT internship. Each program demonstrates core Java concepts and practical applications.

---

## 📋 Projects Overview

### 1. **GradeCalculator**
**Description:** A student grade calculation system that computes total marks, average percentage, and assigns grades based on performance.

**Features:**
- Accept student name and number of subjects
- Input marks for each subject (out of 100)
- Calculate total marks and average percentage
- Assign grades (A, B, C, D, F) based on performance
- Display a detailed result card

**How to Run:**
```bash
javac GradeCalculator.java
java GradeCalculator
```

**Example Usage:**
```
Enter student name: Naga
How many subjects? 3
Enter marks for Subject 1: 85
Enter marks for Subject 2: 90
Enter marks for Subject 3: 78
```

---

### 2. **GuessingGame**
**Description:** An interactive number guessing game where players try to guess a randomly generated number within a limited number of attempts.

**Features:**
- Generate random number between 1 and 100
- Allow user to make multiple attempts
- Provide hints (too high/too low)
- Track number of attempts
- Display statistics after game completion

**How to Run:**
```bash
javac GuessingGame.java
java GuessingGame
```

**Gameplay:**
- Guess a number between 1 and 100
- Receive feedback on each guess
- Try to find the correct number in minimum attempts

---

### 3. **ATMachine**
**Description:** A simple ATM (Automated Teller Machine) simulator that allows users to perform basic banking operations with PIN authentication.

**Features:**
- 4-digit PIN authentication
- Check account balance
- Withdraw money (with balance validation)
- Deposit money
- View transaction history
- User-friendly menu interface

**How to Run:**
```bash
javac ATMachine.java
java ATMachine
```

**Default PIN:** 1234 (or as configured in the program)

**Operations:**
1. Check Balance
2. Withdraw Money
3. Deposit Money
4. View History
5. Exit

---

### 4. **CurrencyConverter**
**Description:** A currency conversion utility that converts between different currencies using exchange rates.

**Features:**
- Support for multiple currencies (USD, EUR, GBP, INR, etc.)
- Real-time-like exchange rate conversion
- User-friendly interface
- Convert between any two currencies
- Handle multiple conversions in one session

**How to Run:**
```bash
javac CurrencyConverter.java
java CurrencyConverter
```

**Example Usage:**
```
Enter base currency (e.g. USD): USD
Enter amount: 100
Enter target currency (e.g. EUR): EUR
100.00 USD = [converted amount] EUR
```

---

## 📁 File Structure

```
CODSOFT/
├── GradeCalculator.java
├── GradeCalculator.class
├── GuessingGame.java
├── GuessingGame.class
├── ATMachine.java
├── ATMachine.class
├── CurrencyConverter.java
├── CurrencyConverter.class
└── README.md
```

---

## 🛠️ Requirements

- **Java Version:** Java 8 or higher
- **Compiler:** javac
- **Runtime:** Java Runtime Environment (JRE)

---

## 💻 Compilation & Execution

All programs follow the same compilation and execution pattern:

**Compile:**
```bash
javac ProgramName.java
```

**Execute:**
```bash
java ProgramName
```

---

## 📝 Notes

- Each program includes input validation and error handling
- All programs use standard Java I/O for user interaction
- Class files (.class) are generated after compilation and can be reused

---

## 👤 Author

**CODSOFT Intern**  
Date: June 16, 2026

---

## 📄 License

These programs are provided as educational material for learning Java programming concepts.
