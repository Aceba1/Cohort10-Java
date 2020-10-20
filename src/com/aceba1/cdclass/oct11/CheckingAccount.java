package com.aceba1.cdclass.oct11;

public class CheckingAccount extends BankAccount<CheckingAccount> {
  private long maxWithdraw;
  private long currentWithdraw;

  public CheckingAccount(String firstName, String lastName, long maxDebt, long maxWithdraw) {
    super(firstName, lastName, maxDebt);
    this.maxWithdraw = maxWithdraw;
    this.currentWithdraw = 0;
  }

  public void resetWithdrawUsage() {
    currentWithdraw = 0;
  }

  public boolean tryPurchase(long price) {
    if (!testWithinLimit(price)) {
      return false;
    }
    withdraw(price);
    return true;
  }

  @Override
  public boolean testWithinLimit(long withdrawCents) {
    return (maxWithdraw > currentWithdraw + withdrawCents)
      || super.testWithinLimit(withdrawCents);
  }

  @Override
  public long withdraw(long amountInCents) {
    long change = Math.min(maxWithdraw, currentWithdraw + amountInCents);
    currentWithdraw += amountInCents;
    return super.withdraw(change);
  }
}
