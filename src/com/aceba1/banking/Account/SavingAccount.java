package com.aceba1.banking.Account;

public class SavingAccount extends BankAccount {

  private int interest;

  public SavingAccount(
    int balance,
    String owner,
    String accountNum,
    int interest
  ) {
    super(balance, owner, accountNum, "Saving");
    this.interest = interest;
  }

  public void applyInterest() {
    balance += (balance * interest) / 100;
  }
}
