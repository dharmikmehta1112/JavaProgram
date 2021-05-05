package Collection_SetDemo;

import java.util.Comparator;

/**
 * @author Dharmik Mehta
 *
 */
public class StudentGradeComparator implements Comparator<StudentForComparator> {

	@Override
	public int compare(StudentForComparator o1, StudentForComparator o2) {
// Sort in Ascending order
		if (o1.grade < o2.grade)
			return -1;
		else if (o1.grade > o2.grade)
			return 1;
		else
			return 0;
/*		
// Sort in Descending order
		if (o1.grade < o2.grade)
			return 1;
		else if (o1.grade > o2.grade)
			return -1;
		else
			return 0;
*/
	}
}