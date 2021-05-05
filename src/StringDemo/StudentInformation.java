package StringDemo;

import java.util.Scanner;

public class StudentInformation {
	
	Scanner key = new Scanner(System.in);	
	String sname, phoneNo, emailId;
	int rollNo;
	static String colName = "Java Selenium";
	
	public void addStudentInfo() {	
		System.out.print("Enter Student Full Name:: ");
		String sname = key.next();
		System.out.print("Enter Student Roll No.:: ");
		int rollNo = key.nextInt();
		System.out.print("Enter Student Phone No.:: ");
		String phoneNo = key.next();
		System.out.print("Enter Student Email-Id:: ");
		String emailId = key.next();
		System.out.println("Student " + sname + " information added suucessfully.");
	}
	
	public void deleteStudentInfo() {	
		sname = "";
		rollNo = 0;
		phoneNo = "";
		emailId = "";
		System.out.println("Student " + sname + " information deleted suucessfully.");
	}
	
	public void displayStudentInfo() {
		System.out.println("=============Student Information=============");
		System.out.println("Student Name:: " + sname);
		System.out.println("Student Roll No:: " + rollNo);
		System.out.println("Student Phone No:: " + phoneNo);
		System.out.println("Student Email Id:: " + emailId);
		System.out.println("Student College Name:: " + colName);
		System.out.println("=============================================");
	}
}