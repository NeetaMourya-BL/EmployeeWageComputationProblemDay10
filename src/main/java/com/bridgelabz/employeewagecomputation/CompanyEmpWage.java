package com.bridgelabz.employeewagecomputation;

public class CompanyEmpWage {
	private final String company;
	static int empRatePerHour = 0;
	static int numOfWorkingDays = 0;
	static int maxHoursPerMonth = 0;
	private static int totalEmpWage;

	public CompanyEmpWage(String company, int empRatePerHous, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHous;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	@Override
	public String toString() {
		return "Total Emp Wage for Company: " + company + " is:" + totalEmpWage;
	}

}
