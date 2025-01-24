
/*problem 1: Bank Account Types
Description: Model a banking system with different account types using hierarchical inheritance. BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
Tasks:
Define a base class BankAccount with attributes like accountNumber and balance.
Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
Implement a method displayAccountType() in each subclass to specify the account type.
Goal: Explore hierarchical inheritance, demonstrating how each subclass can have unique attributes while inheriting from a shared superclass. */
package com.hierarchicalinheritance;

class BankAccount {
  private Long accountNumber;
  private double balance;

  
  BankAccount(Long accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;

  }

  
  public void displayAccountType() {
    System.out.println("current balance : " + balance);
    System.out.println("Account Number : " + accountNumber);
    System.out.println("-------------------------------------------");
  }

}


class SavingAccount extends BankAccount {
  String accountType = "Saving Account";
  String accountHolderName;
  double interestRate;

  SavingAccount(String accountHolderName, double interestRate, Long accountNumber, double balance) {
    super(accountNumber, balance);
    this.accountHolderName = accountHolderName;
    this.interestRate = interestRate;
  }

  @Override
  public void displayAccountType() {
    System.out.println("Type of account : " + accountType);
    System.out.println("Account Holder name : " + accountHolderName);

    System.out.println("InterestRate : " + interestRate);
    super.displayAccountType();

  }

}


class CheckingAccount extends BankAccount {
  String accountType = "checking account";
  String accountHolderName;
  private double withdrawalLimit;

  CheckingAccount(String accountHolderName, double withdrawalLimit, Long accountNumber, double balance) {
    super(accountNumber, balance);
    this.withdrawalLimit = withdrawalLimit;
    this.accountHolderName = accountHolderName;

  }

  @Override
  public void displayAccountType() {
    System.out.println("Type of account : " + accountType);
    System.out.println("Account Holder name : " + accountHolderName);

    System.out.println("InterestRate : " + withdrawalLimit);
    super.displayAccountType();

  }
}

class FixedDepositAccount extends BankAccount {
  String accountType = "Fixed Account";
  String accountHolderName;
  private int depositTerm;

  FixedDepositAccount(String accountHolderName, int depositTerm, Long accountNumber, double balance) {
    super(accountNumber, balance);
    this.depositTerm = depositTerm;
    this.accountHolderName = accountHolderName;

  }

  @Override
  public void displayAccountType() {
    System.out.println("Type of account : " + accountType);
    System.out.println("Account Holder name : " + accountHolderName);
    System.out.println("Deposit Term: " + depositTerm + " months");
    super.displayAccountType();

  }
}

public class BankAccount_Types {
  public static void main(String[] args) {

    SavingAccount saving = new SavingAccount("suraj patel", 7.5, 234567L, 400000);
    FixedDepositAccount fixed = new FixedDepositAccount("Pratham", 12, 4356789L, 6547);
    CheckingAccount checking = new CheckingAccount("vivek", 2000, 23451432L, 765443);

    saving.displayAccountType();
    checking.displayAccountType();
    fixed.displayAccountType();

  }

}
