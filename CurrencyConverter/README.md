# Currency Converter

A currency conversion utility that converts between different currencies using predefined exchange rates.

## Features

- ✅ Support for multiple major currencies (USD, EUR, GBP, INR, JPY, AUD, CAD, CHF, CNY)
- ✅ Real-time-like exchange rate conversion
- ✅ User-friendly interface
- ✅ Convert between any two supported currencies
- ✅ Handle multiple conversions in one session
- ✅ Accurate decimal precision (2 decimal places)
- ✅ Input validation and error handling

## Supported Currencies

| Code | Currency | Country |
|------|----------|---------|
| USD | US Dollar | United States |
| EUR | Euro | European Union |
| GBP | British Pound | United Kingdom |
| INR | Indian Rupee | India |
| JPY | Japanese Yen | Japan |
| AUD | Australian Dollar | Australia |
| CAD | Canadian Dollar | Canada |
| CHF | Swiss Franc | Switzerland |
| CNY | Chinese Yuan | China |

## How to Use

### Compilation
```bash
javac CurrencyConverter.java
```

### Execution
```bash
java CurrencyConverter
```

### Example Usage
```
========================================
          Currency Converter             
========================================

Enter base currency (e.g. USD): USD
Enter amount: 100
Enter target currency (e.g. EUR): EUR

========================================
           Conversion Result             
========================================
100.00 USD = 92.50 EUR
Exchange Rate: 1 USD = 0.9250 EUR
========================================

Do you want to convert more? (yes/no): yes

Enter base currency (e.g. USD): INR
Enter amount: 5000
Enter target currency (e.g. USD): USD

========================================
           Conversion Result             
========================================
5000.00 INR = 60.00 USD
Exchange Rate: 1 INR = 0.0120 USD
========================================
```

## Exchange Rates

Predefined exchange rates (Base: USD = 1.0):
- EUR: 0.92
- GBP: 0.73
- INR: 83.50
- JPY: 157.00
- AUD: 1.52
- CAD: 1.36
- CHF: 0.88
- CNY: 7.24

## Technical Details

- **Language:** Java
- **Exchange Rates:** Hardcoded (for educational purposes)
- **Input Method:** Scanner class
- **Output Format:** Two decimal places
- **Conversion Logic:** Simple multiplication/division
- **Error Handling:** Invalid currency codes, negative amounts

## Files

- `CurrencyConverter.java` - Source code
- `CurrencyConverter.class` - Compiled bytecode

## Author

CODSOFT Intern - June 2026

## Note

Exchange rates are hardcoded for demonstration. Real applications would fetch live rates from APIs like OpenExchangeRates, XE, or OANDA.
