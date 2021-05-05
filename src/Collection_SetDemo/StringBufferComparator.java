package Collection_SetDemo;

import java.util.Comparator;

/**
 * @author Dharmik Mehta
 *
 */
public class StringBufferComparator implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		String s1 = new String(o1);
		String s2 = new String(o2);
		return s1.compareTo(s2); 		// Sort Alphabetically in ascending order
//		return -s1.compareTo(s2);		// Sort Alphabetically in descending order
	}
}