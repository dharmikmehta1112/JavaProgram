package ABCStringUsingMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FindFirstMaxOccurenceOfKeyValue {
	
	private static void findFirstMaxKeyValue(String str){
		
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
		
		char maxKey = 0;
		int maxVal = 0;
		
		Set<Map.Entry<Character, Integer>> entries = hm.entrySet();
		for(Map.Entry<Character, Integer> entry : entries) {
			if(entry.getValue()>maxVal) {
				maxVal = entry.getValue();
				maxKey = entry.getKey();
			}
		}
		System.out.println("Maximum Key:: "+maxKey);
		System.out.println("Maximum Value:: "+maxVal);
		
	}
	
	public static void main(String[] args) {
		String s = "JavaSeleniumAutomationTesting";
		s = s.toLowerCase();
		System.out.println("Orginial String (lowercase):: " +s);
		findFirstMaxKeyValue(s);
	}

}
