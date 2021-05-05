package ABCStringUsingMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindSecondMinOccurenceOfKeyValue {

	private static void findSecondMinKeyValue(String str){
		
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
		
		char minKey = 0, secMinKey = 0;
		int minVal = hm.get(minKey), secMinVal = 0;
		
		Set<Map.Entry<Character, Integer>> entries = hm.entrySet();
		for(Map.Entry<Character, Integer> entry : entries) {
			if(entry.getValue()>minVal) {
				secMinVal = minVal;
				minVal = entry.getValue();
				secMinKey = minKey;
				minKey = entry.getKey();
			} else if(entry.getValue()>secMinVal) {
				secMinVal = entry.getValue();
				secMinKey = entry.getKey();
			}
		}
		System.out.println("Minimum Key:: "+minKey);
		System.out.println("Minimum Value:: "+minVal);
		System.out.println("Second Minimum Key:: "+secMinKey);
		System.out.println("Second Minimum Value:: "+secMinVal);
		
	}
	
	public static void main(String[] args) {
		String s = "JavaSeleniumAutomationTesting";
		s = s.toLowerCase();
		System.out.println("Orginial String (lowercase):: " +s);
		findSecondMinKeyValue(s);
	}

}
