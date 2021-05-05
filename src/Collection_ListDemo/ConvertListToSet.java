package Collection_ListDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Coverting List to hashSet and TreeSet.
 * 
 * @author Dharmik Mehta
 */
public class ConvertListToSet {
	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("Original Array List: " + al);

		Set<Integer> hs = new HashSet<Integer>();
		for (Integer i : al) {
			hs.add(i);
		}
		System.out.println("Coverted Hashset: " + hs);

		Set<Integer> lhs = new LinkedHashSet<Integer>();
		for (Integer i : al) {
			lhs.add(i);
		}
		System.out.println("Coverted LinkedHashset: " + lhs);

		Set<Integer> ss = new TreeSet<Integer>();
		for (Integer i : al) {
			ss.add(i);
		}
		System.out.println("Coverted Treeset: " + ss);
	}
}