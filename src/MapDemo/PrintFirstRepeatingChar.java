package MapDemo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PrintFirstRepeatingChar {
	
	private static void findFirstNonRepeatingChar(String s) {
		
		char[] c = s.toCharArray();
		int size = c.length;
		
		Map<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		
		int i=0, count=0;	
		while(i!=size) {
			if(c[i]!=' ') {				
				if(hm.containsKey(c[i])) {	
					count = hm.get(c[i]);
					count++;
					hm.put(c[i], count);
				} else {				
					hm.put(c[i], 1);
				}
			}
			++i;
		}
		System.out.println("Character with occurence:: "+hm);
		
		Set<Map.Entry<Character, Integer>> entries = hm.entrySet();
		for(Map.Entry<Character, Integer> entry : entries) {
			if(entry.getValue()>1) {
				System.out.println("First repeating character:: " +entry.getKey());
				System.exit(0);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string:: ");
		String s = sc.nextLine();
		s = s.toLowerCase();
		System.out.println("Orginal String (lowercase):: "+s);
		findFirstNonRepeatingChar(s);
		
	}

}
