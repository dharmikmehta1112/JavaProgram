package MapDemo;

import java.util.Comparator;

/**
 * @author Dharmik Mehta
 *
 */
public class MarksComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.marks < o2.marks) {
			return -1; // return any negative value
		} else if (o1.marks > o2.marks) {
			return 1; // return any positive value
		} else
			return 0; // return zero if equals
	}
}