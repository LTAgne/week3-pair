package com.techelevator;

public class HourlyWorker implements Worker {

	private String lastName; 
	private String firstName; 
	private Double hourlyRate;
	
//	public HourlyWorker(double hourlyRate){
//		this.hourlyRate = hourlyRate;
//	}
	
	public HourlyWorker(String firstName, String lastName, double hourlyRate){
		this.lastName = lastName;
		this.firstName = firstName;
		this.hourlyRate = hourlyRate;
	}
	
	public String getFirstName() {
		return firstName; 
	}

	public String getLastName() {
		return lastName;
	}


	public double getWeeklyPay(int hoursWorked) {
		double pay = hourlyRate * hoursWorked;
		double overtime = hoursWorked - 40;
		
		if (overtime > 0){
			pay = pay + (hourlyRate * (overtime * .5));
			return pay;
		}else {
		return pay;
		}
	}

}
