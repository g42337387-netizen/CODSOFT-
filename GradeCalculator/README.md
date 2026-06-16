# Grade Calculator

A student grade calculation system that computes total marks, average percentage, and assigns grades based on performance.

## Features

- ✅ Accept student name and number of subjects
- ✅ Input marks for each subject (out of 100)
- ✅ Calculate total marks and average percentage
- ✅ Assign grades (A, B, C, D, F) based on performance levels
- ✅ Display detailed result card with performance summary

## Grade Criteria

| Grade | Percentage | Performance |
|-------|-----------|-------------|
| A | 90-100 | Excellent |
| B | 80-89 | Very Good |
| C | 70-79 | Good |
| D | 60-69 | Satisfactory |
| F | Below 60 | Fail |

## How to Use

### Compilation
```bash
javac GradeCalculator.java
```

### Execution
```bash
java GradeCalculator
```

### Example Usage
```
Enter student name: Naga
How many subjects? 3

Enter marks for each subject (out of 100):
Subject 1 marks: 85
Subject 2 marks: 90
Subject 3 marks: 78

========================================
           RESULT CARD
========================================
Student Name     : Naga
Total Marks      : 253 / 300
Average          : 84.33%
Grade            : A  (Excellent)
========================================
Great job Naga! Keep it up!
```

## Technical Details

- **Language:** Java
- **Input Method:** Scanner class for user input
- **Output:** Console-based result display
- **Error Handling:** Input validation for marks (0-100)

## Files

- `GradeCalculator.java` - Source code
- `GradeCalculator.class` - Compiled bytecode

## Author

CODSOFT Intern - June 2026
