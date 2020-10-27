package com.aceba1.banking.Account;

public class SavingAccount extends BankAccount {

  private int interest;

  public SavingAccount(
    int balance,
    String owner,
    String accountNum,
    String type,
    int interest
  ) {
    super(balance, owner, accountNum, type);
    this.interest = interest;
  }

  public void applyInterest() {
    int amount = balance * 100 * interest;
  }
}
