package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodsDemo {
	
	public static void main(String[] args) {
		
		List<String> al = new ArrayList<String>();
		
		al.add("Dharmik");
		al.add("Narendra");
		al.add("Priti");
		al.add("Mehta");
		
		System.out.println("Array List:: " +al);
		
		Collections.addAll(al, "Kanha", "Krishna");
		System.out.println("Array List after addAll operation:: " +al);
		
		Collections.sort(al);
		System.out.println("Array List after sort operation:: " +al);
		
		System.out.println("Array List after search operation:: " +Collections.binarySearch(al, "Priti"));
		
		System.out.println("Array List after min operation:: " +Collections.min(al));
		
		System.out.println("Array List after max operation:: " +Collections.max(al));
		
		
	}

}
