package ArrayDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateUsingHashMap {
	
	private static void findDuplicateInArray(int[] a) {

		int count = 0, val = 0;
		Map<Integer, Integer> hm = new HashMap();
		
		for (int i = 0; i < a.length; i++) {
			int key = a[i];
			if(hm.containsKey(key)) 
			{
				val = hm.get(key);
				val++;
				hm.put(key, val);
			}
			else 
			{
				hm.put(key, 1);
			}
		}
		System.out.println("Hashmap occurence:: "+hm);
		System.out.println(hm.size());
		
		Set<Map.Entry<Integer, Integer>> entries = hm.entrySet();
		for(Map.Entry<Integer, Integer> entry : entries)
		{
			if(entry.getValue()>1)
			{
				System.out.println("Duplicate Value:: " +entry.getKey());
			}
			else
			{
				count++;
			}
		}
		if(hm.size()==count)
		{
			System.out.println("No Duplicate value found.");
		}
	}
	
	public static void main(String[] args) {
		int[] a = {2, 5, 2, 7, 18, 3, 11, 5, 3};
		findDuplicateInArray(a);
	}

}
