package com.aceba1.banking.Account;

public class InvestmentAccount extends BankAccount {
  private int investment;
  private int period;

  public InvestmentAccount(int balance, String owner, String accountNum, int investment) {
    super(balance, owner, accountNum, "Investing");
    this.investment = investment;
  }

  public void applyInvestment() {
    balance += (balance * investment) / 100;
  }

}
