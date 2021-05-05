package MapDemo;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Dharmik Mehta
 *
 */
public class TreeMapComparator {

	public static void main(String[] args) {
		
//		TreeMap tm = new TreeMap(new MarksComparator());
		TreeMap tm = new TreeMap(new NameComparator());
		
		Student s1 = new Student(20, "Mahesh", "OBC", 83.42f);
		Student s2 = new Student(30, "Vishnu", "Open", 65.94f);
		Student s3 = new Student(40, "L@xman", "SC", 97.52f);
		Student s4 = new Student(50, "Ram", "ST", 42.79f);
		Student s5 = new Student(60, "Ganesh", "NTB", 58.47f);

		tm.put(s1, "IIT Delhi");
		tm.put(s2, "IIT Delhi");
		tm.put(s3, "IIT Delhi");
		tm.put(s4, "IIT Delhi");
		tm.put(s5, "IIT Delhi");

//		System.out.println(tm);		// Class Cast Exception and will sort on basis of hashcode of key

		Set<Map.Entry> entries = tm.entrySet();
		Iterator<Map.Entry> itr = entries.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = itr.next();
			Student s = (Student) entry.getKey();
//			System.out.println(s.name);
			System.out.println(s.name + " = " + entry.getValue());
		}
	}
}