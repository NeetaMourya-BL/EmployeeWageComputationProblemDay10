package com.bridgelabz.employeewagecomputation;

public class EmpWageBuilderObject {// Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private final String company;
	private static int empRatePerHour = 0;
	private static int numOfWorkingDays = 0;
	private static int maxHoursPerMonth = 0;
	private static int totalEmpWage;

	public EmpWageBuilderObject(String company, int empRatePerHous, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHous;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public static void computeEmpWage() {
		// Variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		// Computation
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
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
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
		}
		totalEmpWage = totalEmpHrs * empRatePerHour;
	}

	@Override
	public String toString() {
		return "Total Emp Wage for Company: " + company + " is:" + totalEmpWage;
	}

	public static void main(String[] args) {
		EmpWageBuilderObject dMart = new EmpWageBuilderObject("DMart", 20, 2, 10);
		EmpWageBuilderObject reliance = new EmpWageBuilderObject("Reliance", 10, 4, 20);
		dMart.computeEmpWage();
		System.out.println(dMart);
		reliance.computeEmpWage();
		System.out.println(reliance);
	}

}
