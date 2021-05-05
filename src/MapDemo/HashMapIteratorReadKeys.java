package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapIteratorReadKeys {

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
		int count = 0;
		Set keys = hm.keySet();
		Iterator itr = keys.iterator();
		System.out.print("Keys of hashMap:: ");
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
			count++;
		}
		System.out.println("\nNumber of Keys:: " +count);
	}
}
