package Collection_ListDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListReverse {

	public void reverseLinkedListWays() {

		List link = Arrays.asList(2, 5, 9, 1 , 3 , 10); 
		
//		List link = new LinkedList();
//		
//		link.add('Z');
//		link.add(50);
//		link.add(30);
//		link.add(90);
//		link.add("D");
//		link.add(40);
//		link.add(25);
//		link.add(45);
//		link.add(true);
		
		System.out.println("Linked List (original):: "+link);
		
// Method 1						
		Collections.reverse(link);
		System.out.println("Linked List after reverse:: "+link);
		
// Method 2
		List reverse = new LinkedList();
		for(int i = link.size()-1; i>=0; i--) {
			reverse.add(link.get(i));
		}
		System.out.println("Linked List after reverse using for:: "+reverse);

// Method 3
		List rever = new LinkedList();
		int j = 0;
		for(Object val : link) {
			rever.add(link.get(j++));
		}
		System.out.println("Linked List after reverse using for each:: "+rever);

// Method 4	
		List rev = new LinkedList();
		ListIterator ltr = link.listIterator(link.size());
		while(ltr.hasPrevious()) {
			rev.add(ltr.previous());
		}
		System.out.println("Linked List after reverse using ListIterator:: "+rev);		
		
	}
	
	public static void main(String[] args) {
		
		new LinkedListReverse().reverseLinkedListWays();
		
	}

}
