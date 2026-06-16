import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    static Scanner input = new Scanner(System.in);
    static Random rng = new Random();

    static int maxTries = 7;
    static int totalPoints = 0;
    static int wins = 0;

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("   Welcome to the Number Guessing Game  ");
        System.out.println("========================================");
        System.out.println("Guess the number I'm thinking (1 - 100)");
        System.out.println("You get " + maxTries + " tries per round.\n");

        char choice = 'y';

        while (choice == 'y' || choice == 'Y') {
            startRound();

            System.out.print("\nPlay another round? (y/n): ");
            choice = input.next().charAt(0);
            System.out.println();
        }

        System.out.println("============ FINAL RESULTS ============");
        System.out.println("Rounds Won  : " + wins);
        System.out.println("Final Score : " + totalPoints);
        System.out.println("Thanks for playing! Bye :)");

        input.close();
    }

    static void startRound() {

        int target = rng.nextInt(100) + 1;
        int triesLeft = maxTries;
        boolean won = false;

        System.out.println("\n------- New Round Started -------");
        System.out.println("I've picked a number. Go ahead!\n");

        while (triesLeft > 0) {

            System.out.print("Your guess (" + triesLeft + " tries left): ");

            if (!input.hasNextInt()) {
                System.out.println("Invalid input! Enter a number between 1 and 100.\n");
                input.next();
                continue;
            }

            int guess = input.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("Out of range! Guess between 1 and 100 only.\n");
                continue;
            }

            if (guess == target) {
                System.out.println("\nCorrect! The number was " + target + ".");
                won = true;

                int earned = triesLeft * 10;
                totalPoints += earned;
                wins++;

                System.out.println("Points this round : " + earned);
                System.out.println("Total Points      : " + totalPoints);
                break;

            } else if (guess < target) {
                System.out.println("Too low! Go higher.\n");
            } else {
                System.out.println("Too high! Go lower.\n");
            }

            triesLeft--;
        }

        if (!won) {
            System.out.println("\nOut of tries! The number was: " + target);
            System.out.println("Better luck next time!");
        }
    }
}