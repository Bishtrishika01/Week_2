/*Problem 2:Bank and Account Holders (Association)
Description: Model a relationship where a Bank has Customer objects associated with it. A Customer can have multiple bank accounts, and each account is linked to a Bank.
Tasks:
Define a Bank class and a Customer class.
Use an association relationship to show that each customer has an account in a bank.
Implement methods that enable communication, such as openAccount() in the Bank class and viewBalance() in the Customer class.
Goal: Illustrate association by setting up a relationship between customers and the bank.*/
import java.util.ArrayList;
import java.util.List;

class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        if (!customers.contains(customer)) {
            customers.add(customer);
            System.out.println("Added " + customer.getName() + " as a customer of " + name + ".");
        } else {
            System.out.println(customer.getName() + " is already a customer of " + name + ".");
        }
    }

    public void openAccount(Customer customer, double initialBalance) {
        customer.openAccount(this, initialBalance);
    }
    
    public String getName() {
        return name;
    }
}

class Customer{
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void openAccount(Bank bank, double initialBalance) {
        String accountNumber = "5689244";
        Account newAccount = new Account(accountNumber, initialBalance);
        accounts.add(newAccount);
        bank.addCustomer(this);
        System.out.println(name + " opened an account " + accountNumber + " with an initial balance of " + initialBalance + ".");
    }

    public double viewBalance(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account.viewBalance();
            }
        }
        System.out.println("Account not found.");
        return 0.0;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into account " + accountNumber + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from account " + accountNumber + ". New balance: " + balance);
        } else {
            System.out.println("Withdrawal amount must be positive and less than or equal to the balance.");
        }
    }

    public double viewBalance() {
        return balance;
    }
}
public class BankManagementSystem {
    public static void main(String[] args){
        Bank myBank = new Bank("My Bank");

        // Create customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Open accounts
        myBank.openAccount(customer1, 100.0);
        myBank.openAccount(customer2, 200.0);

        // Customers view their balances
        System.out.println("Alice's balance: " + customer1.viewBalance("ACC0001"));
        System.out.println("Bob's balance: " + customer2.viewBalance("ACC0001")); // Will not find this account

        // Alice deposits money
        customer1.getAccounts().get(0).deposit(50);

        // View Alice's updated balance
        System.out.println("Alice's new balance: " + customer1.viewBalance("ACC0001"));
    }
}
