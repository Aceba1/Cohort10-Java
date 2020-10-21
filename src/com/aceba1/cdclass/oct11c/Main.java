package com.aceba1.cdclass.oct11c;

public class Main {
  public static void main(String[] args) {
    BankAccount myAcct = new BankAccount(100000,"Phil","1234","Checking");
    CheckingAccount myChecking = new CheckingAccount(200000, "Chelsea", "9876", 10000);
    myAcct.displayDetails();
    myChecking.displayDetails();

    myAcct.deposit(1000);
    myAcct.displayDetails();
    myChecking.deposit(2000);
    myChecking.displayDetails();

    myAcct.withdraw(10000);
    myAcct.displayDetails();
    myChecking.withdraw(5000);
    myChecking.displayDetails();

    myAcct.withdraw(1000000);
    myAcct.displayDetails();
    myChecking.withdraw(6000);
    myChecking.withdraw(4000);
    myChecking.displayDetails();
  }
}
