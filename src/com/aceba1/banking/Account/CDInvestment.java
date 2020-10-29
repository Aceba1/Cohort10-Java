package com.aceba1.banking.Account;

/*
  Extends InvestmentAccount
  Has a private String of timePeriod
  - that uses "M" for Month / "Q" for Quarter
  - does nothing
  Can't be withdrawn from
*/

/*
  CD Investments work by putting in money, waiting for an amount of time, and then getting the extra out
 */

public class CDInvestment extends InvestmentAccount{
  public CDInvestment(int balance, String owner, String accountNum, int investment) {
    super(balance, owner, accountNum, investment);
  }

  public void setInvestment(int investment, String timePeriod) {

  }
}
