package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIteratorReadEntries {

	public static void main(String[] args) {
	
		HashMap hm = new HashMap();
		
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
		System.out.println("Entries in HashMap:: " +hm.entrySet());
		
		int count = 0;
		
		Set entries = hm.entrySet();
		Iterator<Map.Entry> itr = entries.iterator();
		System.out.print("Entries in HashMap:: ");
		while(itr.hasNext()) {
			Map.Entry entry = itr.next();
			System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
			count++;		
		}
		
		System.out.println("\nNumber of entries:: " +count);
		
	}
}
