package ABCStringUsingMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Find maximum occurence of character in a string.

public class FindOccurenceOfChar {
	
	private static void findOccurenceOfChar(String str) {
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
		System.out.println("Character occurence:: " +hm);
		
	}
	
	public static void main(String[] args) {
		String s = "DharmikMehta";
		s = s.toLowerCase();
		System.out.println("Orginal String (lowercase):: "+s);
		findOccurenceOfChar(s);
	}

}
