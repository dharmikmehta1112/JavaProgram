package ABCStringUsingMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FindAllDuplicatesChar {
	
	private static void findDuplicateChar(String str) {
		int count = 0;
		char[] a = str.toCharArray();
		Map<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < a.length; i++) {
			char c = a[i];
			if(hm.containsKey(c)) {
				count = hm.get(c);
				count++;
				hm.put(c, count);
			} else
				hm.put(c, 1);
		}
		System.out.println("Character Occurence:: "+hm);
		
		System.out.print("All Duplicate Charcter in String:: ");
		Set<Map.Entry<Character, Integer>> entries = hm.entrySet();
		for(Map.Entry<Character, Integer> entry : entries) {
			if(entry.getValue()>1) {
				System.out.print(entry.getKey() + ", ");
			}
		}
		
	}
	
	public static void main(String[] args) {
		String s = "DharmikMehta";
		s = s.toLowerCase();
		System.out.println("Original String (lowercase):: "+s);
		findDuplicateChar(s);
		
	}

}
