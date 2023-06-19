package com.nkxgen.spring.jdbc.model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class TransactionsDAO implements TransactionsInterface {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void moneyDeposit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void loanRepayment() {
		// TODO Auto-generated method stub

	}

	@Override
	public void interestDeposit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void moneyWithdrawl() {
		// TODO Auto-generated method stub

	}

	@Override
	public void loanWithdrawl() {
		// TODO Auto-generated method stub

	}

	public TempAccounts getAccountById(int id) {
		System.out.println("trasnactions loki vachanu");
		TempAccounts account = entityManager.find(TempAccounts.class, id);
		return account;

	}

}