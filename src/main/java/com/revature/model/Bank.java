package com.revature.model;

public class Bank {
	private int balance;
	private String accountName;
	
	public Bank(int balance, String accountName) {
		super();
		this.balance = balance;
		this.accountName = accountName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	

}
