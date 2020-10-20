package com.aceba1.cdclass.oct11;

public abstract class BankAccount<T> {
  private long cents;
  private String firstName;

  private String lastName;
  private long minLimit;

  public BankAccount(
    String firstName,
    String lastName,
    long minLimitCents
  ) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.minLimit = minLimitCents;
  }

  public long withdraw(long amountInCents) {
    long change = Math.max(minLimit, cents - amountInCents);
    long diff = cents - change;
    cents = change;
    System.out.println(lastName + " -(" + diff + ")");
    return diff;
  }

  public boolean testWithinLimit(long withdrawCents) {
    return minLimit > cents - withdrawCents;
  }

  public void deposit(long amountInCents) {
    System.out.println(lastName + " - +(" + amountInCents + ")");
    cents += amountInCents;
  }

  public long getCents() {
    return cents;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }
}
