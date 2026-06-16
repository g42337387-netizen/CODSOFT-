# ATM Machine

A simple ATM (Automated Teller Machine) simulator that allows users to perform basic banking operations with PIN authentication.

## Features

- ✅ Secure 4-digit PIN authentication
- ✅ Check account balance
- ✅ Withdraw money with balance validation
- ✅ Deposit money with confirmation
- ✅ View transaction history
- ✅ User-friendly menu interface
- ✅ Session management and exit functionality

## Operations Available

1. **Check Balance** - View current account balance
2. **Withdraw** - Withdraw money from account
3. **Deposit** - Add money to account
4. **View History** - See transaction records
5. **Exit** - Logout and exit

## Security

- PIN Authentication (Default: **1234**)
- Limited login attempts possible
- Secure transaction verification

## How to Use

### Compilation
```bash
javac ATMachine.java
```

### Execution
```bash
java ATMachine
```

### Example Session
```
========================================
       Welcome to the ATM Machine       
========================================

Enter your 4-digit PIN to continue: 1234

Welcome! Select an operation:
1. Check Balance
2. Withdraw Money
3. Deposit Money
4. View Transaction History
5. Exit

Enter choice (1-5): 1
Your current balance: $5000.00

Enter choice (1-5): 2
Enter amount to withdraw: 1000
Withdrawal successful! New balance: $4000.00

Enter choice (1-5): 5
Thank you for using ATM. Goodbye!
```

## Default Credentials

| Field | Value |
|-------|-------|
| PIN | 1234 |
| Initial Balance | $5000 |

## Technical Details

- **Language:** Java
- **Authentication:** Simple PIN validation
- **Data Storage:** In-memory (current session)
- **Operations:** Arithmetic calculations for balance updates
- **Error Handling:** Insufficient funds check, invalid input handling

## Files

- `ATMachine.java` - Source code
- `ATMachine.class` - Compiled bytecode

## Author

CODSOFT Intern - June 2026

## Note

This is a simulation for educational purposes. Real ATM systems have much stronger security measures and database integration.
