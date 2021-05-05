package Collection_SetDemo;

import java.util.TreeSet;

/**
 * @author Dharmik Mehta
 *
 */
public class TreeSetNameComparator {
	public static void main(String[] args) {
				
		TreeSet<StudentForComparator> ts = new TreeSet<StudentForComparator>(new StudentNameComparator());

		StudentForComparator s1 = new StudentForComparator(15, "Ram", "Open", 95.78f, 'A');
		StudentForComparator s2 = new StudentForComparator(22, "Raman", "OBC", 68.53f, 'D');
		StudentForComparator s3 = new StudentForComparator(48, "Radhe", "SBC", 82.45f, 'C');
		StudentForComparator s4 = new StudentForComparator(7, "Shyam", "NTB", 45.81f, 'F');
		StudentForComparator s5 = new StudentForComparator(36, "Rani", "SC", 85.67f, 'B');

		ts.add(s1);
		ts.add(s3);
		ts.add(s5);
		ts.add(s2);
		ts.add(s4);

//		System.out.println(ts);		// CCE

		System.out.println("Student sorted (ascending) on basis of Name: ");
			for (StudentForComparator s : ts)
				System.out.println(s.name + " = " + s.marks + "%");
			
	}
}