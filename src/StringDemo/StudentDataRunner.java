// WAP to add student data and display student info. Also check for no duplicate entry.
// This is a Runner Program for class StudentData.

package StringDemo;

public class StudentDataRunner {

	public static void main(String[] args) {
		
		String name, phoneNo, emailId;
		int rollNo;
		
		StudentData a = new StudentData();
		StudentData b = new StudentData();
		StudentData c = new StudentData();
		StudentData d = new StudentData();
		StudentData e = new StudentData();
		
		a.addStudent("A", 11, "9999988888", "a11@gmail.com");
		a.displayStudentInfo();
		b.addStudent("B", 12, "7777766666", "b12@gmail.com");
		b.displayStudentInfo();
		c.addStudent("C", 13, "5555544444", "c13@gmail.com");
		c.displayStudentInfo();
		d.addStudent("D", 14, "3333322222", "d14@gmail.com");
		d.displayStudentInfo();
		
		StudentData sd[] = {a,b,c,d};		
				
		e.addStudent("E", 15, "9999988888", "e15@gmail.com", sd);
		e.displayStudentInfo();
	}
}