package com.bridge.EmpWageUC;

public class EmpWagePgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int IS_FULLTIME=1;
		double empCheck = Math.floor(Math.random()*10) % 2;
		
		if(empCheck == IS_FULLTIME)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
			
	}

}
