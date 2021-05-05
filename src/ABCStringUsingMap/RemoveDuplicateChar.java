package ABCStringUsingMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//Remove duplicate characters in a string.

public class RemoveDuplicateChar {
	
	private static void removeDuplicateChar(String str) {
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
		
		System.out.println("Character occurence:: " +hm);
		
		String res = "";
		System.out.print("String after removing all duplicate character:: ");
		Set<Map.Entry<Character, Integer>> entries = hm.entrySet();
		for(Map.Entry<Character, Integer> entry : entries) {
			res = res + entry.getKey();
/*
			if(entry.getValue()==1) {
				System.out.print(entry.getKey());
			}
*/			
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		String s = "SillySpiders";
		s = s.toLowerCase();
		System.out.println("Orginal String (Lowercase):: " +s);
		removeDuplicateChar(s);
	}

}
