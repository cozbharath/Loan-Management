**Loan Management System**
**Project Type**

**Console-Based Java Application**

**Project Description**

The Loan Management System is a simple Java console application used to check whether a customer is eligible for a loan or not.

The application:

Takes customer details as input
Validates Aadhaar, PAN, and Phone Number
Checks CIBIL score, salary, and age
Approves or rejects the loan
Technologies Used
Java
OOP Concepts
Interface
Inheritance
Method Overriding
Scanner Class
Regex Validation
Project Files
LoanInterface.java
Loan.java
HomeLoan.java
PersonalLoan.java
LoanInterface.java

Contains common loan methods like:

PAN validation
Aadhaar validation
Phone validation
Salary input
Age input
ROI method
Loan.java

Base class that:

Implements LoanInterface
Takes customer details
Performs validations
Contains common loan functionalities
HomeLoan.java

Child class of Loan.

Features:

Home loan approval
Home loan interest rate
Eligibility checking

Home Loan ROI:

8.5%
PersonalLoan.java

Child class of Loan.

Features:

Personal loan approval
Personal loan interest rate
Eligibility checking

Personal Loan ROI:

12.5%
Validation Rules
Validation	Rule
PAN	10 characters
Aadhaar	12 digits
Phone	Starts from 6-9
CIBIL Score	Above 760
Age	Above 25
OOP Concepts Used
Interface
Inheritance
Method Overriding
Polymorphism
Sample Output
Enter Customer Name:
Ravi

Enter CIBIL Score:
780

Enter Salary:
1200000

Congratulations!!
Your Home Loan is Approved
How to Run

Compile:

javac com/loanManagement/*.java

Run:

java com.loanManagement.HomeLoan



**Author
Podila Nava Bharath Kumar**
