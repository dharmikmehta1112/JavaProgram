package CLIPractice;

import java.util.Scanner;

public class IfElseChainTest {
	public static void main(String[] args) {
		/*String name;
		String pass;
		String name1 = "abc";
		String pass1 = "123";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Username =");
		name = sc.nextLine();
		/*System.out.print("Enter Password =");
		pass = sc.nextLine();
		if (name.equals(name1) && pass.equals(pass1)) {
			System.out.println("Username and password is valid");
		} else {
			System.out.println("Username and Password is invalid");
		}*/
		int age;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Age = ");
		age=sc.nextInt();
		if(age < 18)
		{
			System.out.println("User is Child");
		}
		else if(age < 65)
		{
			System.out.println("User is Adult");
		}
		else
		{
			System.out.println("User is Senior Citizen");
		}
	}

}
