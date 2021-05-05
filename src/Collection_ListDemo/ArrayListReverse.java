package Collection_ListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayListReverse {

	public void arrayListReverseWays() {
		
		int a[] = new int[] {2, 5, 7, 1, 10, 25};

// Convert int array to Integer Array		

//		List arr = new ArrayList();  
//		int d = 0;
//		for(int val : a) {
//			arr.add(a[d++]);
//		}
		
// OR
		
		List arr = Arrays.asList(2, 5, 7, 1, 10, 25);
		System.out.println("List from array:: " +arr);
		
// Method 1		
		Collections.reverse(arr);
		System.out.println("List after reverse:: " +arr);
		
// Method 2
		List al = new ArrayList();
		for(int i = arr.size()-1; i >= 0 ; i--) {
			al.add(arr.get(i));
		}
		System.out.println("List after reverse using for:: " +al);
			
// Method 3
		List all = new ArrayList();
		int i = 0;
		for(Object val : arr) {
			all.add(arr.get(i++));
		}
		System.out.println("List after reverse using for each:: " +all);
		
// Method 4
		List rev = new ArrayList();
		ListIterator itr = arr.listIterator(arr.size());
		while(itr.hasPrevious()) {
			rev.add(itr.previous());
		}
		System.out.println("List after reverse using List Iterator:: " +rev);
		
	}
	
	public static void main(String[] args) {
		
		new ArrayListReverse().arrayListReverseWays();
	}
}
