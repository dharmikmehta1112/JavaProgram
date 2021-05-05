package MapDemo;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Lenovo
 */
public class LinkedHashMapIterator {
	public static void main(String[] args) {

		LinkedHashMap lhm = new LinkedHashMap();

		lhm.put("MH", "Maharashtra");
		lhm.put("GJ", "Gujrat");
		lhm.put("RJ", "Rajasthan");
		lhm.put("MP", "Madhya Pradesh");
		lhm.put("TN", "Tamil Nadu");
		lhm.put("HP", "Himachal Pradesh");
		lhm.put("KL", "Kerala");
		lhm.put("UK", "Utharakhand");
		lhm.put("UP", "Uttar Pradesh");
		lhm.put("OD", "Odissa");
		lhm.put("GT", "Gangtok");

		System.out.println("Key-Value of LinkedHashmap: " + lhm); // Insertion order is preserved
		System.out.println("Size of LinkedHashmap: " + lhm.size());

		Set keys = lhm.keySet();
		for (Object o : keys) {
			System.out.println(o + " ");		// return keys
		}
		
		Set entries = lhm.entrySet();
		for (Object obj : entries) {
			Map.Entry entry = (Map.Entry) obj;
			System.out.println(entry.getKey() + " = " + entry.getValue());		// return keys and values
		}

/*
// Approach I (Using keySet() - Returns only Values)
		System.out.println("-------------Approach I (Using keySet())---------------");
		Set keys = lhm.keySet();
		Iterator itr = keys.iterator();
		while (itr.hasNext()) {
			System.out.println(lhm.get(itr.next()));
		}

// Approach II (Using entrySet() - Return Keys and Values)
		System.out.println("-------------Approach II (Using entrySet())---------------");
		Set entries = lhm.entrySet();
		Iterator itr1 = entries.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
*/	
	}
}