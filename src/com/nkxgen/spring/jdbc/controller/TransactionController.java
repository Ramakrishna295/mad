package com.nkxgen.spring.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nkxgen.spring.jdbc.model.TempAccounts;
import com.nkxgen.spring.jdbc.model.TransactionsInterface;;

@Controller
public class TransactionController {

	@Autowired
	TransactionsInterface ti;

	@RequestMapping(value = "/moneydeposit", method = RequestMethod.GET)
	public String money(Model model) {
		return "Money_Deposit";
	}

	@RequestMapping(value = "/loanrepay", method = RequestMethod.GET)
	public String loan(Model model) {
		return "Loan_Repayment";
	}

	@RequestMapping(value = "/interest", method = RequestMethod.GET)
	public String interest(Model model) {
		return "Interest_Deposit";
	}

	@RequestMapping(value = "/withdrawl", method = RequestMethod.GET)
	public String moneywid(Model model) {
		return "money_withdrawl_form";
	}

	@RequestMapping(value = "/lowid", method = RequestMethod.GET)
	public String lowid(Model model) {
		return "loan_withdrawl_form";
	}

	/*
	 * @RequestMapping(value = "/mm", method = RequestMethod.POST) public String
	 * getaccountdetails(@RequestParam("accountNumber") int Acnt_id, Model model) { // int acnt_id = Acnt_id; //
	 * System.out.println("print the value: " + acnt_id); // TempAccounts account = ti.getAccountById(acnt_id); //
	 * System.out.println("print the value vachindhi raa: " + account.getAcnt_cust_id()); //
	 * model.addAttribute("account", account); return "sub_money_deposit"; }
	 */

	@RequestMapping(value = "/getaccountdetails", method = RequestMethod.POST)
	public String getaccountdetails(@RequestParam("accountNumber") int Acnt_id, Model model) {
		int acnt_id = Acnt_id;
		System.out.println("print the value: " + acnt_id);
		TempAccounts account = ti.getAccountById(acnt_id);
		System.out.println("print the value vachindhi raa: " + account.getAcnt_cust_id());
		model.addAttribute("account", account);
		return "sub_money_deposit";
	}

}