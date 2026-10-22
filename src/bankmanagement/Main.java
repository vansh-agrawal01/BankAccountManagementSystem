package bankmanagement;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account;

        try {
            System.out.print("Enter account holder name: ");
            String holderName = scanner.nextLine();
            System.out.print("Enter a positive account number: ");
            int accountNumber = Integer.parseInt(scanner.nextLine().trim());
            account = new BankAccount(holderName, accountNumber);
        } catch (IllegalArgumentException exception) {
            System.out.println("Could not create account: " + exception.getMessage());
            scanner.close();
            return;
        }

        boolean running = true;
        while (running) {
            System.out.println("\n1. View account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine().trim();

            try {
                switch (choice) {
                    case "1":
                        System.out.println("Account holder: " + account.getHolderName());
                        System.out.println("Account number: " + account.getAccountNumber());
                        System.out.println("Balance: "
                                + account.getBalance().setScale(2).toPlainString());
                        break;
                    case "2":
                        System.out.print("Enter deposit amount: ");
                        account.deposit(new BigDecimal(scanner.nextLine().trim()));
                        System.out.println("Deposit successful. Balance: "
                                + account.getBalance().setScale(2).toPlainString());
                        break;
                    case "3":
                        System.out.print("Enter withdrawal amount: ");
                        account.withdraw(new BigDecimal(scanner.nextLine().trim()));
                        System.out.println("Withdrawal successful. Balance: "
                                + account.getBalance().setScale(2).toPlainString());
                        break;
                    case "4":
                        running = false;
                        System.out.println("Goodbye.");
                        break;
                    default:
                        System.out.println("Please choose an option from 1 to 4.");
                }
            } catch (IllegalArgumentException exception) {
                System.out.println("Operation failed: " + exception.getMessage());
            }
        }

        scanner.close();
    }
}