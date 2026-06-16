import java.util.Scanner;

public class ATMachine {

    static Scanner input = new Scanner(System.in);

    // Bank Account class to store balance
    static class BankAccount {
        private double balance;

        BankAccount(double startingBalance) {
            this.balance = startingBalance;
        }

        double getBalance() {
            return balance;
        }

        boolean withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Enter a valid amount!");
                return false;
            }
            if (amount > balance) {
                System.out.println("Insufficient balance! Your balance is only Rs." + String.format("%.2f", balance));
                return false;
            }
            balance -= amount;
            return true;
        }

        boolean deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Enter a valid amount to deposit!");
                return false;
            }
            balance += amount;
            return true;
        }
    }

    // ATM class to handle operations
    static class ATM {
        private BankAccount account;

        ATM(BankAccount account) {
            this.account = account;
        }

        void checkBalance() {
            System.out.println("\n--- Balance Enquiry ---");
            System.out.println("Available Balance: Rs." + String.format("%.2f", account.getBalance()));
        }

        void withdrawMoney() {
            System.out.println("\n--- Withdrawal ---");
            System.out.print("Enter amount to withdraw: Rs.");

            if (!input.hasNextDouble()) {
                System.out.println("Invalid amount entered!");
                input.next();
                return;
            }

            double amount = input.nextDouble();

            if (account.withdraw(amount)) {
                System.out.println("Rs." + String.format("%.2f", amount) + " withdrawn successfully!");
                System.out.println("Remaining Balance: Rs." + String.format("%.2f", account.getBalance()));
            }
        }

        void depositMoney() {
            System.out.println("\n--- Deposit ---");
            System.out.print("Enter amount to deposit: Rs.");

            if (!input.hasNextDouble()) {
                System.out.println("Invalid amount entered!");
                input.next();
                return;
            }

            double amount = input.nextDouble();

            if (account.deposit(amount)) {
                System.out.println("Rs." + String.format("%.2f", amount) + " deposited successfully!");
                System.out.println("Updated Balance: Rs." + String.format("%.2f", account.getBalance()));
            }
        }

        void showMenu() {
            System.out.println("\n========================================");
            System.out.println("              ATM MACHINE               ");
            System.out.println("========================================");
            System.out.println("  1. Check Balance");
            System.out.println("  2. Withdraw Money");
            System.out.println("  3. Deposit Money");
            System.out.println("  4. Exit");
            System.out.println("========================================");
            System.out.print("Choose an option (1-4): ");
        }
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("       Welcome to the ATM Machine       ");
        System.out.println("========================================");

        // starting balance is Rs.10000
        BankAccount myAccount = new BankAccount(10000.00);
        ATM atm = new ATM(myAccount);

        System.out.print("\nEnter your 4-digit PIN to continue: ");
        String pin = input.next();

        // simple pin check
        if (!pin.equals("1234")) {
            System.out.println("Wrong PIN! Access Denied.");
            input.close();
            return;
        }

        System.out.println("PIN Accepted! Welcome.\n");

        int choice = 0;

        while (choice != 4) {
            atm.showMenu();

            if (!input.hasNextInt()) {
                System.out.println("Please enter a number between 1 and 4!");
                input.next();
                continue;
            }

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    atm.withdrawMoney();
                    break;
                case 3:
                    atm.depositMoney();
                    break;
                case 4:
                    System.out.println("\nThank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option! Please choose between 1 and 4.");
            }
        }

        input.close();
    }
}
