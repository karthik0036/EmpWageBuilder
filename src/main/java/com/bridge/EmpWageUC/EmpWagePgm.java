package com.bridge.EmpWageUC;

public class EmpWagePgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CONSTANTS
		int IS_FULLTIME=1;
		int IS_PARTIME=2;
		int RATE_PER_HR=20;
		//Variables
		int empHrs=0;
		int empWage=0;
		//Computation
		double empCheck = Math.floor(Math.random()*10) % 3;
		
		if(empCheck == IS_FULLTIME)
			empHrs=8;
		else if(empCheck == IS_PARTIME)
			empHrs=4;
		else
			empHrs=0;
		
		empWage = empHrs*RATE_PER_HR;
		System.out.println("WAGE IS "+ empWage);
			
	}

}
