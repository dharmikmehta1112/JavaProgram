package CLIPractices;
import java.util.Scanner;

/* A student will not be allowed to sit in exam if his/her attendence is less than 75%. Take following input from user: Number of classes held,
Number of classes attended. And print percentage of class attended. Is student is allowed to sit in exam or not. */

/* Modify question to allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ('Y' or 'N') and print accordingly. */

public class StudentAttendance
{
	public static void main (String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter number of class held: ");
		float class_held = keyboard.nextFloat();
		System.out.print("Enter number of class attend: ");
		float class_atten = keyboard.nextFloat();
		System.out.print("Are you suffering from any medical cause (Y / N): ");
		char medical = keyboard.next().charAt(0);

		float class_atten_percent = (class_atten / class_held) * 100;

		// if (class_atten_percent > 75)
		// 	System.out.println("Your class attendance is " + class_atten_percent + "% and allow to sit in exam.");
		// else
		// 	System.out.println("Your class attendance is " + class_atten_percent + "% and not allow to sit in exam.");

		// if (medical == 'Y' || medical == 'y')
		// 	System.out.println("Your class attendance is " + class_atten_percent + "% and due to medical cause you allow to sit in exam.");
		// else
		// 	System.out.println("Your class attendance is " + class_atten_percent + "% and not allow to sit in exam.");

		if (medical == 'Y' || medical == 'y')
			System.out.println("Your class attendance is " + class_atten_percent + "% and due to medical cause you allow to sit in exam.");
		else if (class_atten_percent > 75)
			System.out.println("Your class attendance is " + class_atten_percent + "% and allow to sit in exam.");
		else
			System.out.println("Your class attendance is " + class_atten_percent + "% and not allow to sit in exam.");
		}
}