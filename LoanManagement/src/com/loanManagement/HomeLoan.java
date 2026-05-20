package com.loanManagement;

import java.util.Scanner;

public class HomeLoan extends Loan {
	static Scanner sc = new Scanner(System.in);

	public void getPersonalLoanDocInfo() {
		System.out.println("Submitted all the documents Successfully !!");
	}

	@Override
	public double getROI() {
		return 8.5;
	}

	public static void main(String[] args) {

		HomeLoan loan = new HomeLoan();

		String name = loan.getName();
		String fatherName = loan.getFatherName();

		int cibil = loan.getCibiliScore();
		double salary = loan.getCustomerSalary();
		int age = loan.getCustomerAge();

		boolean aadhaarValid = loan.isValidAadhaar();
		boolean panValid = loan.isValidPAN();
		boolean phoneValid = loan.isValidPhone();

		if (cibil > 760 && salary > 1000000 && age > 25 && aadhaarValid && panValid && phoneValid) {
			System.out.println("Congrtulations !! Your  Personal Loan got approved ");
			System.out.println("Your Home Loan ROI is : " + loan.getROI());
			System.out.println("As entered Confirming Your Detials are : ");
			System.out.println(loan.getCustomerAddressDetails());
			loan.getPersonalLoanDocInfo();

		} else {
			System.out.println("Sorry !! Your  Personal Loan got Rejected ");
		}
	}

}
