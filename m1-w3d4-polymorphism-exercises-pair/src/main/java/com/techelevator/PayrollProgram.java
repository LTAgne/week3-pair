package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class PayrollProgram {
	public static void main (String[] args) {

	SalaryWorker greg = new SalaryWorker("Greg", "Universe", 13000);
	VolunteerWorker jim = new VolunteerWorker("Smith", "Jim");
	HourlyWorker linda = new HourlyWorker("Linda", "Belcher", 16);
	
	Worker[] allWorkers = new Worker[]{ greg, jim, linda};
	
	System.out.format("%-20s %-20s %-20s%n", "Employee","Hours Worked","Pay");
	
	int hours = 0;
	double pay = 0.00;
	
	for (Worker workers : allWorkers){
		int hoursWorked = (int) (Math.random()*40);
		hours += hoursWorked;
		pay += workers.getWeeklyPay(hoursWorked);
		
		String name = workers.getLastName() + ", " + workers.getFirstName();
		System.out.println(String.format("%-20s %-20s %-1s %-18.2f", name, hoursWorked, "$", workers.getWeeklyPay(hoursWorked)));
		}
	System.out.println();	
	System.out.println("Total Hours: " + hours);
	System.out.println("Total Pay: $" + pay + "0");
	
	}
}
