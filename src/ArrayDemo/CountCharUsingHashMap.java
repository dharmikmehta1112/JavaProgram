package ArrayDemo;

import java.util.Map;
import java.util.TreeMap;

public class CountCharUsingHashMap {
	
	public static void main(String[] args) {
		
		int[] a = new int[]{10, 34, 5, 10, 3, 5, 10};
		int count = 0;
		Map<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		
		for (int i = 0; i < a.length; i++) {
			int c = a[i];
			if(tm.containsKey(c)) {
				count = tm.get(c);
				count++;
				tm.put(c, count);
			} else
				tm.put(c, 1);
		}
		System.out.println(tm);
	}

}
