package com.loanManagement;

import java.util.Scanner;

public class PersonalLoan extends Loan {

	static Scanner sc = new Scanner(System.in);

	public void getPersonalLoanDocInfo() {
		System.out.println("Submitted all the documents Successfully !!");
	}

	@Override
	public double getROI() {
		return 8.5;
	}

	public static void main(String[] args) {

		PersonalLoan l = new PersonalLoan();

		String name = l.getName();
		String fatherName = l.getFatherName();

		int cibil = l.getCibiliScore();
		double salary = l.getCustomerSalary();
		int age = l.getCustomerAge();

		boolean aadhaarValid = l.isValidAadhaar();
		boolean panValid = l.isValidPAN();
		boolean phoneValid = l.isValidPhone();

		if (cibil > 760 && salary > 1000000 && age > 25 && aadhaarValid && panValid && phoneValid) {
			System.out.println("Congrtulations !! Your  Personal Loan got approved ");
			System.out.println("Your Home Loan ROI is : " + l.getROI());
			System.out.println("As entered Confirming Your Detials are : ");
			System.out.println(l.getCustomerAddressDetails());
			l.getPersonalLoanDocInfo();

		} else {
			System.out.println("Sorry !! Your  Personal Loan got Rejected ");
		}
	}

}
