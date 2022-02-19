package com.bridgelabz.employeewagecomputation;

public class EmpWageBuilderUC1 {

	public static void main(String[] args) {
		// Contants
		int IS_FULL_TIME = 1;
		// Computations
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");

	}
}
