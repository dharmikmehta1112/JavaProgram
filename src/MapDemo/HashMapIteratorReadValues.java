package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class HashMapIteratorReadValues {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
//		HashMap hm = new LinkedHashMap();		// Order as per insertion
		
		hm.put("MH", "Maharashtra");
		hm.put("GJ", "Gujrat");
		hm.put("RJ", "Rajasthan");
		hm.put("MP", "Madhya Pradesh");
		hm.put("TN", "Tamil Nadu");
		hm.put("HP", "Himachal Pradesh");
		hm.put("KL", "Kerala");
		hm.put("UK", "Utharakhand");
		hm.put("UP", "Uttar Pradesh");
		hm.put("OD", "Odissa");
		hm.put("GT", "Gangtok");

		System.out.println("Key-Value of Hashmap: " + hm);		// Insertion order is not guaranted (it is as per hashcode of key)
		System.out.println("Size of Hashmap: " + hm.size());
		System.out.println("Values in Hashmap:: " +hm.values());
		
		int count = 0;
		
		Set keys = hm.keySet();
		Iterator itr = keys.iterator();
		System.out.print("Values in Hashmap:: ");
		while(itr.hasNext()) {
			Object value = hm.get(itr.next());
//			Object value = hm.values();
//			itr.next();
			System.out.print(value + " ");
			count++;
		}
		System.out.println("\nNumber of values:: " +count);
		
	}
}
