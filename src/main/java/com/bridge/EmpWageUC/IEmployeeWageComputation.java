package com.bridge.EmpWageUC;

public interface IEmployeeWageComputation {

	void addCompanyInfo(String companyName, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth);

    void computeEmpWage();

}
