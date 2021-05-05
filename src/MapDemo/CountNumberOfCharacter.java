package MapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Dharmik Mehta
 * 
 *         IMP IQ
 *
 */
public class CountNumberOfCharacter {

	public static void main(String[] args) {
		int count = 0;
		String s = "DharmikMehta";
		s = s.toLowerCase();
		SortedMap<Character, Integer> hm = new TreeMap();
//		HashMap<Character, Integer> hm = new LinkedHashMap();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c!=' ') {
			if (hm.containsKey(c)) {
				count = hm.get(c);
				count++;
				hm.put(c, count);
			} else {
				hm.put(c, 1);
			}
		}
		}
		System.out.println("Count of number of Character in String:: " + hm);
	}
}