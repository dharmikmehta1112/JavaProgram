package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

/**
 * @author Dharmik Mehta
 *		   IMP IQ  
 *         How to iterate HashMap?? 2 approach discuss below: Using keySet() and
 *         entrySet()
 */
public class HashMapIterator {

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
/*		
		Set keys = hm.keySet();
		for (Object o : keys) {
			System.out.println(o + " ");	// return keys
		}
		
		Set entries = hm.entrySet();
		for (Object obj : entries) {
			Map.Entry entry = (Map.Entry) obj;
			System.out.println(entry.getKey() + " = " + entry.getValue());		// return keys and values
		}
*/
		
// Approach I (Using keySet() - Returns only Values)
		System.out.println("-------------Approach I (Using keySet())---------------");
//		Set keys = hm.keySet();
//		Iterator itr = keys.iterator();
		Iterator itr = hm.keySet().iterator();
		while (itr.hasNext()) {
			Object o = hm.get(itr.next()); 	// next() will return key as it is iterate over keySet() and get(Object key)
											// will return Object/Value
			System.out.println(o);
		}
// Approach II (Using entrySet() - Return Keys and Values)
		System.out.println("-------------Approach II (Using entrySet())---------------");
		Set entries = hm.entrySet();
		Iterator itr1 = entries.iterator();
		while (itr1.hasNext()) {
			Map.Entry entry = (Map.Entry) itr1.next(); // next() will return entry as it is iterate over entrySet()
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}		
	}
}