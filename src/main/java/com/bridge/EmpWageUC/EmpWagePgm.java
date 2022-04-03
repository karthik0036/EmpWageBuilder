package com.bridge.EmpWageUC;

public class EmpWagePgm {
	public static final int IS_FULLTIME=1;
	public static final int IS_PARTIME=2;
	
	private final String company;
    private final int ratePerHr;
    private final int numWrkingDays;
    private final int maxHrs;
    private int totalEmpWage;
	
    
	public EmpWagePgm(String company, int ratePerHr, int numWrkingDays, int maxHrs) {
		this.company = company;
		this.ratePerHr = ratePerHr;
		this.numWrkingDays = numWrkingDays;
		this.maxHrs = maxHrs;
	}


	public void EmpWageCompany() {
		//Variables
		int empHrs=0,empWage=0,totalEmpHrs=0,totalWorkingDays=0,totalEmpWage=0;
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
		totalEmpWage=totalEmpHrs*ratePerHr;
		System.out.println("TOTALWAGE of Emp working in "+ company +" is " + totalEmpWage);	
		this.totalEmpWage = totalEmpWage;
		
		
	}
	
	 @Override
	    public String toString() {
	        return ("Total monthly Wage of an employee in " + company + " is " + totalEmpWage);
	    }
	

	public static void main(String[] args) {
		//EmpWagePgm employeeWage = new EmpWagePgm();
		//employeeWage.EmpWageCompany("FlipKart",20,20,70);
		//employeeWage.EmpWageCompany("Amazon",25,30,100);
		EmpWagePgm amazon = new EmpWagePgm("AMAZON", 20, 20, 100);
        amazon.EmpWageCompany();
        System.out.println(amazon);
        EmpWagePgm flipcart = new EmpWagePgm("FLIPCART", 10, 15, 100);
        flipcart.EmpWageCompany();
        System.out.println(flipcart);
	}
}
		
		
		
		
	
		
		
			
