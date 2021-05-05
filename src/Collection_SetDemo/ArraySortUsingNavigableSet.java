package Collection_SetDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class ArraySortUsingNavigableSet {

	public static void main(String[] args) {
		
		int a[] = new int[] {3, 5, 1, 2, 7, 4, 9};
		
		Integer b[] = new Integer[a.length];
		
		int i = 0;
		for(int val : a)
			b[i++] = Integer.valueOf(val);
		
		List<Integer> al = new ArrayList<Integer>(Arrays.asList(b));
		
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println("Sorted array (ascending):: " + al);
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Sorted array (descending):: " +al);
		
		Collections.reverse(al);
		System.out.println("Sorted array (descending):: " +al);
		
		SortedSet<Integer> ss = new TreeSet<Integer>(al);
		
		System.out.println("Lowest:: " + ss.first());
		System.out.println("Highest:: " + ss.last());
		
		NavigableSet<Integer> ns = new TreeSet<Integer>(al);
		
		System.out.println("Poll First:: " + ns.pollFirst());		// remove and return first or lowest element
		System.out.println("Poll Last:: " + ns.pollLast());			// remove and return last or highest element
		
		ns = ns.descendingSet();
		System.out.println("Sorted array (descending):: " +ns);
		
	}
}
