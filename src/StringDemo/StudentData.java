// WAP to add student data and display student info. Also check for no duplicate entry.

package StringDemo;

public class StudentData {

	String name, phoneNo, emailId;
	int rollNo;
	final static String collegeName = "Java Selenium";
	
	public void addStudent(String name, int rollNo, String phoneNo, String emailId, StudentData sd[]) {
		this.name = name;
		this.rollNo = rollNo;	
		
		for(int i=0; i<sd.length; i++)
		{
			if(phoneNo.equals(sd[i].phoneNo))
			{
				System.out.println("Duplicate phone no. found.");
				this.emailId = emailId;
				System.out.println("Student " + name + " phone number can't be added.");
			}
			else
			{
				this.phoneNo = phoneNo;
				this.emailId = emailId;
				System.out.println("Student " + name + " information added suucessfully.");
			}
		}	
	}
	
	public void addStudent(String name, int rollNo, String phoneNo, String emailId) {
		this.name = name;
		this.rollNo = rollNo;		
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		System.out.println("Student " + name + " information added suucessfully.");
	}
	
	public void displayStudentInfo() {
		System.out.println("=============Student Information=============");
		System.out.println("Student Name:: " + name);
		System.out.println("Student Roll No:: " + rollNo);
		System.out.println("Student Phone No:: " + phoneNo);
		System.out.println("Student Email Id:: " + emailId);
		System.out.println("Student College Name:: " + collegeName);
		System.out.println("=============================================");
	}
}