package com.aceba1.cdclass.oct11c;

public class BankAccount {
  private int balance;
  private String owner;
  private String accountNum;
  private String type;

  public BankAccount(int balance, String owner, String accountNum, String type) {
    this.balance = balance;
    this.owner = owner;
    this.accountNum = accountNum;
    this.type = type;
  }

  public void deposit(int amt) {
    if (amt > 0)
      balance += amt;
    else
      System.out.println("Cannot deposit, passing negative value!");
  }

  public void withdraw(int amt) {
    if (amt <= balance)
      balance -= amt;
    else
      System.out.println("Cannot withdraw, request exceeds balance!");
  }

  public void displayDetails() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return "Bank " +
      accountNum +
      " " +
      type +
      " (" +
      owner +
      "): \t" +
      balance +
      "c";
  }
}
