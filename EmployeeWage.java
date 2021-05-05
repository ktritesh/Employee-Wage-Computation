package com.bridgelabz.employeewage;

public class EmployeeWage {

	public static void main(String[] args) {
		//Constants
		int IS_PRESENT = 1;
		//Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_PRESENT)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}

}
