package Collection_SetDemo;

import java.util.Comparator;

/**
 * @author Dharmik Mehta
 *
 */
public class StudentNameComparator implements Comparator<StudentForComparator> {

	@Override
	public int compare(StudentForComparator o1, StudentForComparator o2) {
		return o1.name.compareTo(o2.name); 		// sort alphabetically in ascending order
//		return - o1.name.compareTo(o2.name);	// sort alphabetically in descending order
	}
}