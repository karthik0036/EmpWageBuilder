package com.bridge.EmpWageUC;

public class EmpWagePgm {
	public static final int IS_FULLTIME=1;
	public static final int IS_PARTIME=2;
	public static final int RATE_PER_HR=20;
	public static final int NUM_WORKING_DAYS=20;
	

	public static void main(String[] args) {
		//Variables
		int empHrs=0,empWage=0,totalWage=0;
		//Computation
		for(int day=0;day<NUM_WORKING_DAYS;day++) {
		int empCheck = (int) Math.floor(Math.random()*10) % 3;
		
		switch (empCheck) {
			case IS_FULLTIME:
				empHrs=8;
				break;
			case IS_PARTIME:
				empHrs=4;
				break;
			default:
				empHrs=0;
		}
		
		empWage = empHrs*RATE_PER_HR;
		System.out.println("WAGE IS "+ empWage);
		totalWage+=empWage;
		}
		System.out.println("TOTALWAGE IS "+ totalWage);
			
	}

}
