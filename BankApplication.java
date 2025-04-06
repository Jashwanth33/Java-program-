package project;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class
 {
    private List<Customer> customers = new ArrayList<>();
    private List<Account> accounts = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        // Create a customer
        Customer customer = new Customer();
       customer.setName("John Doe");
        customer.setAddress("123 Main St");
        customer.setPhoneNumber("123-456-7890");
        customer.setEmail("john.doe@example.com");
        customer.setDateOfBirth(LocalDate.of(1990, 1, 1));

        // Add customer to the list
        customers.add(customer);

        // Create an account
        Account account = new Account();
        account.setAccountNumber("123456789");
        account.setBalance(1000.00);

        // Add account to the list
        accounts.add(account);

        // Perform user-driven account activities
        userMenu(account);

        // Print out the lists
        System.out.println("Customers: " + customers);
        System.out.println("Accounts: " + accounts);
        System.out.println("Transactions: " + transactions);
        System.out.println("Loans: " + loans);
    }

    // User menu for account activities
    private void userMenu(Account account) {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Credit Account");
            System.out.println("2. Debit Account");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    creditAccount(account);
                    break;
                case 2:
                    debitAccount(account);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to credit the account
    private void creditAccount(Account account) {
        System.out.print("Enter amount to credit: ");
        double amount = scanner.nextDouble();
        account.credit(amount);
        addTransaction(amount, "credit");
    }

    // Method to debit the account
    private void debitAccount(Account account) {
        System.out.print("Enter amount to debit: ");
        double amount = scanner.nextDouble();
        account.debit(amount);
        addTransaction(amount, "debit");
    }

    // Add a transaction to the list
    private void addTransaction(double amount, String type) {
        Transaction transaction = new Transaction();
        transaction.setTransactionId(UUID.randomUUID().toString());
        transaction.setAmount(amount);
        transaction.setTransactionDate(LocalDate.now());
        transaction.setType(type);

        transactions.add(transaction);
    }
}
