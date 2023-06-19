package com.nkxgen.spring.jdbc.model;

public interface TransactionsInterface {

	public TempAccounts getAccountById(int id);

	public void moneyDeposit();

	public void loanRepayment();

	public void interestDeposit();

	public void moneyWithdrawl();

	public void loanWithdrawl();

}