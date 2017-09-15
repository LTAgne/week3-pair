package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {

	private String name;
	private String address;
	private String phoneNumber;
	private List<BankAccount> accounts = new ArrayList<>();
	private boolean vip = false;
	
	public BankCustomer(String name, String address, String phoneNumber){
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	public boolean isVip() {
		
		DollarAmount totalSum = new DollarAmount(0);
		
		for (BankAccount element : accounts) {
			 totalSum = totalSum.plus(element.getBalance());
		}
		if (totalSum.isGreaterThanOrEqualTo(new DollarAmount(25000))){
			return true;
		} else {
			return false;
		}
	}
	
	
	public void addAccounts(BankAccount newAccount) {
		accounts.add(newAccount);
	}
	
	// getters and setters
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public BankAccount[] getAccounts() {
		return accounts.toArray(new BankAccount[accounts.size()]);
			
		}
	
		
	}

