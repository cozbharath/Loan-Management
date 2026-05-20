package com.loanManagement;

import java.util.Scanner;

public class Loan implements LoanInterface {
	static Scanner sc = new Scanner(System.in);

	@Override
	public String getCustomerAddressDetails() {
		String address = null;

		System.out.println("Enter your Flat number : ");
		String fno = sc.next();

		System.out.println("Enter your plot number  : ");
		sc.nextLine();
		String plot = sc.nextLine();

		System.out.println("ENter Your Street name ");
		String street = sc.nextLine();

		System.out.println("ENter Your City name ");
		String city = sc.nextLine();

		System.out.println("ENter Your PINCODE  ");
		long pin = sc.nextLong();

		address = "Flat NO : " + fno + " , Plot  :" + plot + " , Street : " + street + " , City : " + city + " , PIN : "
				+ pin;

		return address;

	}

	@Override
	public boolean isValidPAN() {

		System.out.println("Enter PAN number :  ");
		String pan = sc.next();
		return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
	}

	@Override
	public boolean isValidPhone() {

		System.out.println("Enter your Phone number : ");
		String phone = sc.next();
		return phone.matches("[6-9]\\d{9}");
	}

	@Override
	public boolean isValidAadhaar() {
		System.out.println("Enter 12 digit Aadhar number ");
		String aadhaar = sc.next();
		return aadhaar.matches("\\d{12}");

	}

	@Override
	public double getROI() {

		return 10.0;
	}

	@Override
	public int getCibiliScore() {

		System.out.println("Enter your Cibil Score ");
		int cibil = sc.nextInt();
		return cibil;
	}

	@Override
	public int getCustomerAge() {

		System.out.println("Customer Age :");
		int age = sc.nextInt();
		return age;
	}

	@Override
	public double getCustomerSalary() {
		System.out.println("Enter your Salary : ");
		double salary = sc.nextDouble();
		return salary;
	}

	public String getName() {

		System.out.println("Enter your Name : ");
		String name = sc.nextLine();
		return name;

	}

	public String getFatherName() {
		System.out.println("Enter your Father Name : ");
		String fName = sc.nextLine();
		return fName;

	}

}
