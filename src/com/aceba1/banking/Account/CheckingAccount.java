package com.aceba1.banking.Account;

public class CheckingAccount extends BankAccount {
  private int dailyLimit;
  private int dailyWithdrawn;

  public CheckingAccount(
    int balance,
    String owner,
    String accountNum,
    int dailyLimit
  ) {
    super(balance, owner, accountNum, "Checking");
    this.dailyLimit = dailyLimit;
  }

  public void resetDailyWithdrawn() {
    dailyWithdrawn = 0;
  }

  @Override
  public void withdraw(int amt) {
    if (dailyWithdrawn + amt > dailyLimit) {
      System.out.println("Withdraw amount exceeds daily limit!");
      return;
    }
    super.withdraw(amt);
  }
}
