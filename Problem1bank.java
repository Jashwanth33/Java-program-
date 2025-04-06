package testop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Problem1bank {

    static class Customer {
        private String name;
        private String address;
        private String phoneNumber;
        private String email;
        private LocalDate dateOfBirth;

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        @Override
        public String toString() {
            return "Customer{name='" + name + "', address='" + address + "', phoneNumber='" + phoneNumber + "', email='" + email + "', dateOfBirth=" + dateOfBirth + '}';
        }
    }

    static class Account {
        private String accountNumber;
        private double balance;

        // Getters and Setters
        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        @Override
        public String toString() {
            return "Account{accountNumber='" + accountNumber + "', balance=" + balance + '}';
        }
    }

    static class Transaction {
        private String transactionId;
        private double amount;
        private LocalDate transactionDate;

        // Getters and Setters
        public String getTransactionId() {
            return transactionId;
        }

        public void setTransactionId(String transactionId) {
            this.transactionId = transactionId;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public LocalDate getTransactionDate() {
            return transactionDate;
        }

        public void setTransactionDate(LocalDate transactionDate) {
            this.transactionDate = transactionDate;
        }

        @Override
        public String toString() {
            return "Transaction{transactionId='" + transactionId + "', amount=" + amount + "', transactionDate=" + transactionDate + '}';
        }
    }

    static class Loan {
        private String loanId;
        private double amount;
        private LocalDate loanDate;

        // Getters and Setters
        public String getLoanId() {
            return loanId;
        }

        public void setLoanId(String loanId) {
            this.loanId = loanId;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public LocalDate getLoanDate() {
            return loanDate;
        }

        public void setLoanDate(LocalDate loanDate) {
            this.loanDate = loanDate;
        }

        @Override
        public String toString() {
            return "Loan{loanId='" + loanId + "', amount=" + amount + "', loanDate=" + loanDate + '}';
        }
    }

    static class BankApplication {
        private static List<Customer> customers = new ArrayList<>();
        private static List<Account> accounts = new ArrayList<>();
        private static List<Transaction> transactions = new ArrayList<>();
        private static List<Loan> loans = new ArrayList<>();

        public static void main(String[] args) {
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

            // Create a transaction
            Transaction transaction = new Transaction();
            transaction.setTransactionId("TXN001");
            transaction.setAmount(500.00);
            transaction.setTransactionDate(LocalDate.now());

            // Add transaction to the list
            transactions.add(transaction);

            // Create a loan
            Loan loan = new Loan();
            loan.setLoanId("LN001");
            loan.setAmount(10000.00);
            loan.setLoanDate(LocalDate.now());

            // Add loan to the list
            loans.add(loan);

            // Print out the lists
            System.out.println("Customers: " + customers);
            System.out.println("Accounts: " + accounts);
            System.out.println("Transactions: " + transactions);
            System.out.println("Loans: " + loans);
        }
    }
}
