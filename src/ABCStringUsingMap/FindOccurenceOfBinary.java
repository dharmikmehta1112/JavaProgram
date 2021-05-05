package ABCStringUsingMap;

import java.util.HashMap;
import java.util.Map;

public class FindOccurenceOfBinary {
	
	private static void findOccurenceOfBin(int a[]) {
		
		int count = 0;
		
		Map<Integer,Integer> hm = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < a.length; i++) {
			int c = a[i]; 
			if(hm.containsKey(c)) {
				count = hm.get(c);
				count++;
				hm.put(c, count);
			} else
				hm.put(c, 1);
		}
		System.out.println("Binary Occurence:: " +hm);
	}
	
	public static void main(String[] args) {
		int[] a = {1, 0, 1, 1, 0, 1};
		findOccurenceOfBin(a);
	}

}