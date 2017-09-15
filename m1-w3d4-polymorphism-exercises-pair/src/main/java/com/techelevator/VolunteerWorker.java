package com.techelevator;

public class VolunteerWorker implements Worker {

	private String lastName; 
	private String firstName;
	
	
	public VolunteerWorker(String lastName, String firstName){
		this.lastName = lastName;
		this.firstName = firstName;	
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public double getWeeklyPay(int hoursWorked) {
		double pay = hoursWorked * 0;
		return pay;
	}


}
