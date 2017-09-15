package com.techelevator;

public class SalaryWorker implements Worker {

	private double annualSalary; 
	private String lastName; 
	private String firstName; 
	
		public SalaryWorker(String firstName, String lastName, double annualSalary){
		this.lastName = lastName; 
		this.firstName = firstName;
		this.annualSalary = annualSalary; 
	}
	
	public String getFirstName() {
		return firstName; 
	}

	public String getLastName() {
		return lastName; 
	}


	public double getWeeklyPay(int hoursWorked) {
		double pay = annualSalary / 52;
		return pay;
	}


	public double getAnnualSalary() {
		return annualSalary;
	}

}
