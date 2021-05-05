package Collection_SetDemo;

import java.util.Comparator;

/**
 * @author Dharmik Mehta
 * 
 *         To create a comparator class as StudentMarksComparator
 */
public class StudentMarksComparator implements Comparator <StudentForComparator> {

	@Override
	public int compare(StudentForComparator o1, StudentForComparator o2) {
// Sort in Ascending Order
		if (o1.marks < o2.marks)
			return -1;
		else if (o1.marks > o2.marks)
			return 1;
		else
			return 0;
/*		
// Sort in Descending Order
		if (o1.marks < o2.marks)
			return 1;
		else if (o1.marks > o2.marks)
			return -1;
		else
			return 0;
*/
	}
}