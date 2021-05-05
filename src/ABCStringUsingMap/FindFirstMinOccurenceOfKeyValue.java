package ABCStringUsingMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindFirstMinOccurenceOfKeyValue {
	
	private static void findFirstMinKeyValue(String str){
		
		int count = 0;
		char[] a = str.toCharArray();
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for (int i = 0; i < a.length; i++) {
			char c = a[i];
			if(hm.containsKey(c)) {
				count = hm.get(c);
				count++;
				hm.put(c, count);
			} else
				hm.put(c, 1);
		}
		
		System.out.println("Character Occurence:: " +hm);
		
		char minKey = 0;
		int minVal = hm.get(minKey);
		
		Set<Map.Entry<Character, Integer>> entries = hm.entrySet();
		for(Map.Entry<Character, Integer> entry : entries) {
			if(entry.getValue()<minVal) {
				minVal = entry.getValue();
				minKey = entry.getKey();
			}
		}
		System.out.println("Minimum Key:: "+minKey);
		System.out.println("Minimum Value:: "+minVal);
		
	}
	
	public static void main(String[] args) {
		String s = "JavaSeleniumAutomationTesting";
		s = s.toLowerCase();
		System.out.println("Orginial String (lowercase):: " +s);
		findFirstMinKeyValue(s);
	}


}
