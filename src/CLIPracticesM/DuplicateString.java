package CLIPracticesM;
// Write a code to find Duplicates String

import java.util.Scanner;

public class DuplicateString {
	
	public void findDuplicateString() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a statement: ");
		String stmt = sc.nextLine();
		stmt = stmt.trim();
		System.out.println("\nEnter a string: ");
		String dupl = sc.nextLine();
		dupl = dupl.trim();
		
		int count = 0;
		boolean b = stmt.contains(dupl);
		if(b==true) {
			System.out.println("In a statement, enter string found.");
			System.out.println("Now checking for duplicate string.");
//			String stmt1[] = stmt.toCharArray();
			String stmt1[] = stmt.split(" ");
			byte len = (byte) stmt1.length;
			System.out.println("Length of split string: "+len);
			for(byte i=0; i<len; i++) {
				if(stmt1[i]==dupl){
					count++;
					System.out.println("Match found and count is " +count);
				}
			}
			if(count==2){
				System.out.println("In a statement, enter string found duplicate.");
			}
		}
		else
			System.out.println("In a statement, enter string not found.");
	}

	public static void main(String[] args) {
		new DuplicateString().findDuplicateString();
	}
}