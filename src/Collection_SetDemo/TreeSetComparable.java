package Collection_SetDemo;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Dharmik Mehta
 */
public class TreeSetComparable {

	public static void main(String[] args) {

		Collection c = new TreeSet();		//
		Collections cc;
		Set s = new TreeSet();			//
		SortedSet r = new TreeSet();		//
		NavigableSet n = new TreeSet();		//
		TreeSet t = new TreeSet();		//
/*
//	Using String Literal
	String s1 = "Ram";
	String s2 = "Vishnu";
	String s3 = "Mahesh";
	t.add(s1);
	t.add(s2);
	t.add(s3);
	System.out.println(t);

//	Using new String Object:
	String t1 = new String("Ram");
	String t2 = new String("Vishnu");
	String t3 = new String("Mahesh");
	t.add(t1);
	t.add(t2);
	t.add(t3);
	System.out.println(t);
*/
		TreeSet<StudentComparable> ts = new TreeSet<StudentComparable>();		// making treeset generic to consist only student object
		StudentComparable s1 = new StudentComparable(12, "Ram", "Open", 94.5f);
		StudentComparable s2 = new StudentComparable(15, "Vishnu", "OBC", 65.4f);
		StudentComparable s3 = new StudentComparable(20, "Mahesh", "NT1", 80.9f);
		
		ts.add(s1);		// s1
		ts.add(s2);		// s1.compareTo(s2)~ Returns a negative integer, zero, or a positive integer as this
						//                   object is less than, equal to, or greater than the specified object.
						// => [s2, s1]
		ts.add(s3);		// s3.compareTo(s1) and s3.comapareTo(s2)
						// Binary Search Tree (Reading Presedence - PreOrder (Ascending)) ~ left--> root--> right
		System.out.println("Object hashcode in sorted order w.r.t comparision on marks: \n" + ts);
		
		System.out.println("Student sorted in ascending order on basis of marks:");
		for (StudentComparable stud : ts) {
			System.out.print(stud.name + " ");
		}		
		
		System.out.println("\nFirst Topper: " + ts.first().name);
		System.out.println("Last Topper: " + ts.last().name);
		
//		t.add(10);
//		t.add(12);
//		t.add(15);
//		t.add(122);
//		t.add(110);
//		t.add(101);
//		t.add(5);
//		t.add(8);
//		System.out.println("Treeset elements are: " + t);
//		System.out.println("Substet of treeset: " + t.subSet(5, 122));	// 5 inclusive & 122 exclusive
//		System.out.println("Substet of treeset: " + t.subSet(5, true, 122, true));	// 5 and 122 both inclusive
//		System.out.println("Headset of treeset: " + t.headSet(50));				// 50 exclusive
//		System.out.println("Headset of treeset: " + t.headSet(50,true));		// 50 inclusive		
//		System.out.println("Tailset of treeset: " + t.tailSet(10));				// 10 inclusive
//		System.out.println("Tailset of treeset: " + t.tailSet(10,false));		// 10 exclusive
//		System.out.println("Smallest/First element of treeset: " + t.first());
//		System.out.println("Largest/Last element of treeset: " + t.last());
	}
}