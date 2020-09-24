package com.BridgeLabz;

public class EmpWageBuilderFor {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 2;
	
	public static void main(String[] args) {
		//Variables
		int empHrs = 0,empWage = 0,totalEmpWage = 0;
		//Computation
		for (int day=0; day<NUM_OF_WORKING_DAYS; day++) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
				break;
			}
			empWage = empHrs * EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;
			System.out.println("Emp Wage : "+empWage);
		}
		System.out.println("Total Employee Wage : "+totalEmpWage);
	}

}
