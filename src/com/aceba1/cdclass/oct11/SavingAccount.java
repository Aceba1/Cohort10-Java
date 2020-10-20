package com.aceba1.cdclass.oct11;

public class SavingAccount extends BankAccount<SavingAccount> {
  private double apt;
  private long minApt;

  public SavingAccount(String firstName, String lastName, long maxDebt) {
    super(firstName, lastName, maxDebt);
    this.apt = 0.01;
    this.minApt = 100;
  }

  public SavingAccount(String firstName, String lastName, long maxDebt, double apt, long minStoreForApt) {
    super(firstName, lastName, maxDebt);
    this.apt = apt;
    this.minApt = minStoreForApt;
  }

  public long stepRate(int monthStep) {
    long cents = getCents();

    if (cents < minApt)
      return 0;

    double sum = cents;
    for (int i = 0; i < monthStep; i++)
      sum += apt * sum;

    long diff = (long)sum - cents;
    deposit(diff);
    return diff;
  }
}
