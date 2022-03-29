package com.bridge.EmpWageUC;

public class EmpWagePgm {
	public static final int IS_FULLTIME=1;
	public static final int IS_PARTIME=2;
	
	public void EmpWageCompany(String company,int ratePerHr,int numWrkingDays,int maxHrs) {
		//Variables
		int empHrs=0,empWage=0,totalEmpHrs=0,totalWorkingDays=0,totalWage=0;
		//Computation
		while(totalEmpHrs<=maxHrs && totalWorkingDays<numWrkingDays) {
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
		
		empWage = empHrs*ratePerHr;
		totalEmpHrs+=empHrs; 
		System.out.println("DAY "+totalWorkingDays+" EmpHrs "+ empHrs+" wage is "+ empWage);
		
		}
		totalWage=totalEmpHrs*ratePerHr;
		System.out.println("TOTALWAGE of Emp working in "+ company +" is " + totalWage);			
		
		
	}
	

	public static void main(String[] args) {
		EmpWagePgm employeeWage = new EmpWagePgm();
		employeeWage.EmpWageCompany("FlipKart",20,20,70);
		employeeWage.EmpWageCompany("Amazon",25,30,100);
	}
}
		
		
		
		
	
		
		
			
