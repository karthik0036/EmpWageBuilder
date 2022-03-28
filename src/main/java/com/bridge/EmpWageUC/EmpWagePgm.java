package com.bridge.EmpWageUC;

public class EmpWagePgm {
	public static final int IS_FULLTIME=1;
	public static final int IS_PARTIME=2;
	public static final int RATE_PER_HR=20;
	public static final int NUM_WORKING_DAYS=20;
	public static final int MAX_HRS_MONTH=100;
	
	public void EmpWageCompany1() {
		//Variables
		int empHrs=0,empWage=0,totalEmpHrs=0,totalWorkingDays=0,totalWage=0;
		//Computation
		while(totalEmpHrs<=MAX_HRS_MONTH && totalWorkingDays<NUM_WORKING_DAYS) {
			totalWorkingDays++;
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
		totalEmpHrs+=empHrs; 
		System.out.println("DAY "+totalWorkingDays+" EmpHrs "+ empHrs+" wage is "+ empWage);
		
		}
		totalWage=totalEmpHrs*RATE_PER_HR;
		System.out.println("TOTALWAGE of Emp working in Company1:"+ totalWage);			
		
		
	}
	

	public static void main(String[] args) {
		EmpWagePgm employeeWage = new EmpWagePgm();
		employeeWage.EmpWageCompany1();
	}
}
		
		
		
		
	
		
		
			
