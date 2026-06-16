import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    static int maxAttempts = 7;
    static int totalScore = 0;
    static int roundsWon = 0;

    public static void main(String[] args) {

        System.out.println("===== Welcome to the Number Guessing Game! =====");
        System.out.println("I will think of a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts per round. Good luck!\n");

        char playAgain = 'y';

        while (playAgain == 'y' || playAgain == 'Y') {
            playRound();

            System.out.print("\nDo you want to play another round? (y/n): ");
            playAgain = sc.next().charAt(0);
            System.out.println();
        }

        System.out.println("========== GAME OVER ==========");
        System.out.println("Rounds Won   : " + roundsWon);
        System.out.println("Total Score  : " + totalScore);
        System.out.println("Thanks for playing! See you next time :)");

        sc.close();
    }

    static void playRound() {

        int secretNumber = rand.nextInt(100) + 1;
        int attemptsLeft = maxAttempts;
        boolean guessedRight = false;

        System.out.println("---- New Round ----");
        System.out.println("I've picked a number. Start guessing!\n");

        while (attemptsLeft > 0) {

            System.out.print("Enter your guess (" + attemptsLeft + " attempts left): ");

            // basic input check
            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                sc.next(); // clear bad input
                continue;
            }

            int guess = sc.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("Please guess a number between 1 and 100 only.\n");
                continue;
            }

            if (guess == secretNumber) {
                System.out.println("\nYou got it! The number was " + secretNumber + ".");
                guessedRight = true;

                // score = attempts remaining * 10
                int pointsEarned = attemptsLeft * 10;
                totalScore += pointsEarned;
                roundsWon++;

                System.out.println("Points earned this round: " + pointsEarned);
                System.out.println("Total Score so far: " + totalScore);
                break;

            } else if (guess < secretNumber) {
                System.out.println("Too low! Try a bit higher.\n");
            } else {
                System.out.println("Too high! Try a bit lower.\n");
            }

            attemptsLeft--;
        }

        if (!guessedRight) {
            System.out.println("\nOops! You ran out of attempts.");
            System.out.println("The correct number was: " + secretNumber);
            System.out.println("Better luck next round!");
        }
    }
}
