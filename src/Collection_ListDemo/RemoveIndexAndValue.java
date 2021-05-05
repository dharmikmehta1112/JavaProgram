package Collection_ListDemo;

import java.util.ArrayList;
import java.util.List;

public class RemoveIndexAndValue {
	
	private void removeByValueString() {
		List al = new ArrayList();
		al.add("Dharmik");
		al.add("Narendra");
		al.add("Mehta");
		al.add("Priti");

		System.out.println("Array List:: " +al);		// [Dharmik, Narendra, Mehta, Priti]
		
		al.remove("Dharmik");
		System.out.println(al);					// [Narendra, Mehta, Priti]
		
		al.remove(new String("Mehta"));
		System.out.println(al);				// [Narendra, Priti]
	}
	
	private void removeByValue() {
		List al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(1);
		al.add(2);

		System.out.println("Array List:: " +al);		// [10, 20, 30, 1, 2]
		
		al.remove(new Integer(1));
		System.out.println(al);			// [10, 20, 30, 2]
		
		al.remove(new Integer(2));
		System.out.println(al);			// [10, 20, 30]
	}

	private void removeByIndex() {
		List al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(1);
		al.add(2);
		System.out.println("Array List:: " +al);	// [10, 20, 30, 1, 2]
		
		al.remove(1);
		System.out.println(al);		// [10, 30, 1, 2]
		
		al.remove(2);
		System.out.println(al);		// [10, 30, 2]
	}
	
	public static void main(String[] args) {
		System.out.println("Remove By Index::");
		new RemoveIndexAndValue().removeByIndex();
		System.out.println("Remove By Value::");
		new RemoveIndexAndValue().removeByValue();
		System.out.println("Remove By Value for String::");
		new RemoveIndexAndValue().removeByValueString();
	}

}
