package ABCStringUsingMap;

//Find first repeated character in a string.

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FindFirstRepeatedChar {
	
	private static void firstRepeatedChar(String str) {
		
		int count = 0;
		char[] c = str.toCharArray();
		int size = c.length;
		Map<Character, Integer> hm = new LinkedHashMap();
		
		for (int i = 0; i < c.length; i++) {
			if(c[i]!=' ') {				
				if(hm.containsKey(c[i])) {
					count = hm.get(c[i]);
					count++;
					hm.put(c[i], count);
				} else
					hm.put(c[i], 1);
			}
		}
		System.out.println("Character occurence:: " +hm);
		
		Set<Map.Entry<Character, Integer>> entries = hm.entrySet();
		for(Map.Entry<Character, Integer> entry : entries) {
			if(entry.getValue()>1) {
				System.out.print("First repeated character:: " +entry.getKey());
				System.exit(0);
			}	
		}
		
	}
	
	public static void main(String[] args) {
		String s = "Dharmik Mehta";
		s = s.toLowerCase();
		System.out.println("Orginal String (lowercase):: "+s);
		firstRepeatedChar(s);
	}
	
}
