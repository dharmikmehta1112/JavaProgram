package ABCStringUsingMap;

// Check if the input string has all unique characters in it.

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CheckStringForAllUniqueChar {
	
	private static void checkStringForUniqueChar(String str){
		int count=0;
		char[] c = str.toCharArray();
		int size = c.length;
//		Map<Character, Integer> hm = new HashMap();		// { =1, a=2, r=1, d=1, t=1, e=1, h=2, i=1, k=1, m=2}
		Map<Character, Integer> hm = new LinkedHashMap();		// {d=1, h=2, a=2, r=1, m=2, i=1, k=1,  =1, e=1, t=1}
//		Map<Character, Integer> hm = new TreeMap();		// { =1, a=2, d=1, e=1, h=2, i=1, k=1, m=2, r=1, t=1}
		
		for (int i = 0; i < c.length; i++) {
			if(hm.containsKey(c[i]) && c[i]!=' ') {
				count = hm.get(c[i]);
				count++;
				hm.put(c[i], count);
			} else
				hm.put(c[i], 1);
		}
		System.out.println("Character Occurence:: "+hm);
		
		Set<Map.Entry<Character, Integer>> entries = hm.entrySet();
		for(Map.Entry<Character, Integer> entry : entries) {
			if (entry.getValue()>1) {
				System.out.println("String not contain all unique character.");
				System.exit(0);			
			}
		}
		System.out.println("String contain all unique character.");	
	}
	
	public static void main(String[] args) {
		String s = "Dharmik";
		s = s.toLowerCase();
		System.out.println("Original String (lowercase):: "+s);
		checkStringForUniqueChar(s);	
	}

}
