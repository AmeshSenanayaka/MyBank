package com.amesh.mybank.domain;

public class Account {
	private String accountNumber;
	private Customer customer;
	private Bank bank;
	private Branch branch;
	private double balance;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	private double getBalance() { 
		return balance;
	}
	private void setBalance(double balance) {
		this.balance = balance;
	}
	
}
