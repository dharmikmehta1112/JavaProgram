package CLIPractices;
import java.util.Scanner;

/*
A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
*/

public class GradeSystem
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student marks: ");
		float mks = sc.nextFloat();

		if(mks<25)
			System.out.println('F');
		else if (mks>=25 && mks<45)
			System.out.println('E');
		else if (mks>=45 && mks<50)
			System.out.println('D');
		else if (mks>=50 && mks<60)
			System.out.println('C');
		else if (mks>=60 && mks<80)
			System.out.println('B');
		else if (mks>=80)
			System.out.println('A');
		else
			System.out.println("Invalid student marks.");
	}
}