# Guessing Game

An interactive number guessing game where players try to guess a randomly generated number within a limited number of attempts.

## Features

- ✅ Generate random number between 1 and 100
- ✅ Allow user to make multiple attempts with feedback
- ✅ Provide helpful hints (too high/too low)
- ✅ Track number of attempts taken
- ✅ Display game statistics and performance rating
- ✅ Replay option after game completion

## Game Mechanics

1. Computer generates a random number (1-100)
2. Player attempts to guess the number
3. Feedback provided for each guess:
   - "Too High!" - Number is higher
   - "Too Low!" - Number is lower
   - "Correct!" - Number guessed correctly
4. Game ends when number is guessed or attempts exhausted
5. Statistics displayed: attempts used, attempts remaining

## How to Use

### Compilation
```bash
javac GuessingGame.java
```

### Execution
```bash
java GuessingGame
```

### Example Gameplay
```
========================================
        Welcome to Guessing Game         
========================================

I'm thinking of a number between 1 and 100.
You have 10 attempts to guess it.

Attempt 1/10 - Enter your guess: 50
Too Low! Try a higher number.

Attempt 2/10 - Enter your guess: 75
Too High! Try a lower number.

Attempt 3/10 - Enter your guess: 62
Correct! You guessed the number 62 in 3 attempts!

========================================
         Game Statistics
========================================
Total Attempts: 3
Remaining Attempts: 7
Performance: Excellent! (Guessed in less than 5 attempts)
========================================
```

## Technical Details

- **Language:** Java
- **Random Number:** java.util.Random
- **Input Method:** Scanner class
- **Logic:** Simple high/low comparison algorithm
- **Difficulty Level:** Easy to Medium

## Files

- `GuessingGame.java` - Source code
- `GuessingGame.class` - Compiled bytecode

## Author

CODSOFT Intern - June 2026
