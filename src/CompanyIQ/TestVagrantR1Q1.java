package CompanyIQ;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// Find non repeating character from a string I/P: abcdef

public class TestVagrantR1Q1 {
		
	private static String findNonRepeatingCharUsingHashMap(String str) {
		Map<Character, Integer> hm = new LinkedHashMap();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(hm.containsKey(c)) {
				count = hm.get(c);
				count++;
				hm.put(c, count);
			} else {
				hm.put(c, 1);
			}
		}
		System.out.println("Character occurence:: "+hm);
		
		char key = 0;
		Set<Map.Entry<Character, Integer>> entries = hm.entrySet();
		for(Map.Entry<Character, Integer> entry : entries) {
			if(entry.getValue()==1) {
				key = entry.getKey();
				break;
			}
		}
		
		return Character.toString(key);
		
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string:: ");
		String s = sc.nextLine();
		s = s.trim();
		System.out.println("First Non Repeating character in a String:: " +findNonRepeatingCharUsingHashMap(s));
		
	}

}
