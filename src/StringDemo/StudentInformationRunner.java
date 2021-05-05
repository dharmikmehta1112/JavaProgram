package StringDemo;

import java.util.Scanner;

public class StudentInformationRunner {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);		
		char choice;
		StudentInformation st[] = new StudentInformation[10];
		for(int i=0; i<st.length; i++)
		{
			st[i] = new StudentInformation();
		}
		
		do {
			System.out.println("======================================= \nWelcome to Student Information Portal. \n======================================= \n1. Add a Student. \n2. Delete a Student. \n3. Display any Student Info. \n4. Enter '4' to exit. \nEnter your choice:: ");
			int uChoice = key.nextInt();
		switch(uChoice) {
				case 1:	st[i].addStudentInfo();	
						break;
				case 2:	st[i].deleteStudentInfo();
						break;
				case 3:	s[i].displayStudentInfo();
						break;
				case 4:	System.out.print("Exit Successfully.");
						System.exit(4);
				default : System.out.print("\nInvalid choice.");
						break;
			}
			System.out.print("\nDo you like to continue. \nEnter 'Y' for Yes and 'N' for No:: ");
			choice = key.next().charAt(0);
		} while (choice == 'Y' || choice == 'y');
	}
}