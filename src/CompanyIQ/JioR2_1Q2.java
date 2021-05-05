package CompanyIQ;

// Find Max and Min key and value using HashMap

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class JioR2_1Q2 {

	private static void maxKeyValue() {
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(9, 90);
		hm.put(3, 30);
		hm.put(2, 20);
		hm.put(5, 50);
		hm.put(7, 70);
		System.out.println("Hashmap:: " +hm);
		
		int minKey = Collections.min(hm.keySet());
		int maxKey = Collections.max(hm.keySet());
		
		System.out.println("Minimum Key:: " +minKey);
		
		System.out.println("Maximum Key:: " +maxKey);
		
		System.out.println("Minimum Value:: " +hm.get(minKey));
		
		System.out.println("Maximum Value:: " +hm.get(maxKey));
		
		int minValue = Collections.min(hm.values());
		int maxValue = Collections.max(hm.values());
		
		System.out.println("Minimum Value:: " +minValue);
		System.out.println("Maximum Value:: " +maxValue);
	
	}
	
	public static void main(String[] args) {
		maxKeyValue();
	}
	
}
