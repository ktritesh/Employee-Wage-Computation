package com.bridgelabz.employeewage;

public class EmployeeWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;

	//Constructor
	public EmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}
	
	public static void main(String[] args) {
		
		//Creating object of Dmart
		EmployeeWage dMart = new EmployeeWage("DMart", 20, 2, 10);
		
		//Variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		
		//Computation
		while (totalEmpHrs <= dMart.maxHoursPerMonth &&
				totalWorkingDays < dMart.numOfWorkingDays) {			
		totalWorkingDays++;
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
		case IS_FULL_TIME:
			empHrs = 8;
			break;
		case IS_PART_TIME:
			empHrs = 4;
			break;
		default:
			empHrs = 0;
		}
		totalEmpHrs += empHrs;
		System.out.println("Day: " + totalWorkingDays + "Emp Hr: " +empHrs);
	}
	int totalEmpWage = totalEmpHrs * dMart.empRatePerHour;
	System.out.println("Total Emp Wage: " + totalEmpWage);
		
  }
}

