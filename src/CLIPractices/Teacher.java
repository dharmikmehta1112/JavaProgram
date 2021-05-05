package CLIPractices;
public class Teacher
{
int age;

// Student satish = new Student();		// Instance variable

static Student satish = new Student();		// Static variable

	public static void main(String[] args)
	{
		// Student satish = new Student();		// Local variable
		// Teacher t = new Teacher();
		satish.rollno = 10;
		System.out.println("Satish roll no. is: " + satish.rollno);
		System.out.println("Satish school name is: " + Student.schoolname);
	}
}