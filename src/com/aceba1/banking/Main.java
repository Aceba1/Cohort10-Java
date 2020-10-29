package com.aceba1.banking;

import com.aceba1.banking.Account.BankAccount;
import com.aceba1.banking.Account.CheckingAccount;
import com.aceba1.banking.Account.SavingAccount;

public class Main {
  public static void main(String[] args) {
    BankAccount myAcct = new BankAccount(1000_00,"Phil","1234","Checking");
    CheckingAccount myChecking = new CheckingAccount(2000_00, "Chelsea", "9876", 10000);
    SavingAccount mySavings = new SavingAccount(1000_00, "Will", "3333", 5);
    myAcct.displayDetails();
    myChecking.displayDetails();
    mySavings.displayDetails();

    myAcct.deposit(10_00);
    myAcct.displayDetails();
    myChecking.deposit(20_00);
    myChecking.displayDetails();
    mySavings.deposit(100_00);
    mySavings.displayDetails();

    myAcct.withdraw(10000);
    myAcct.displayDetails();
    myChecking.withdraw(5000);
    myChecking.displayDetails();
    mySavings.withdraw(5000);
    mySavings.displayDetails();
//
//    myAcct.withdraw(1000000);
//    myAcct.displayDetails();
//    myChecking.withdraw(6000);
//    myChecking.withdraw(4000);
//    myChecking.displayDetails();

    mySavings.displayDetails();
    for (int i = 0 ;i < 5; i++) {
      mySavings.applyInterest();
      mySavings.displayDetails();
    }
  }
}
