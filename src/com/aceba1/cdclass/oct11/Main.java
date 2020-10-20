package com.aceba1.cdclass.oct11;

public class Main {
  public static void main(String[] args) {
    SavingAccount savingAccount = new SavingAccount("Michael", "Taco", -500_00);
    savingAccount.deposit(1000_00);
    savingAccount.stepRate(12);
    System.out.println(savingAccount.getCents() / 100.0);
    savingAccount.withdraw(1000_00);
    System.out.println(savingAccount.getCents() / 100.0);
    savingAccount.withdraw(1000_00);
    System.out.println(savingAccount.getCents() / 100.0);
  }
}
