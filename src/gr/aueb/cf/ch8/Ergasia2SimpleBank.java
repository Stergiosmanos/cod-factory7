package gr.aueb.cf.ch8;

import java.util.Scanner;

public class Ergasia2SimpleBank {

    static double balance = 500;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double amount;

        while (true) {
            System.out.println("--- Simple Bank Menu ---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    try {
                        deposit(-34);
                    }catch (Exception e) {
                        System.out.println("An error happened. Try again....");
                    }
                    break;
                case 2:
                    System.out.println("Please select the amount you want to withdraw.");
                    amount = scanner.nextDouble();
                    try {
                        withdraw(amount);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        System.out.println("An error happened. Try again....");
                    }
                    break;
                case 3:
                    System.out.println("Current balance: $ " + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using Simple Bank. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    public static void deposit(double amount) throws Exception{
        try {
            if (amount <= 0) {
                throw new Exception("Amount must be positive.");
            }
            balance += amount;
            System.out.println("Successfully deposited " + amount); // log
        } catch (Exception e) {
            System.err.println("Error. " + e.getMessage());         // log
            throw e;
        }
    }

    public static void withdraw(double amount) throws Exception {
        try {
            if (amount <= 0) {
                throw new Exception("Amount must be positive.");
            }
            if (amount > balance) {
                throw new IllegalArgumentException("Amount must be less than balance.");
            }
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);    // log
        } catch (Exception e) {
            System.err.println("Error. " + e.getMessage());             // log
            throw e;
        }
    }

}
