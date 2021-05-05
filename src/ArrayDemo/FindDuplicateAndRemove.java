package ArrayDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FindDuplicateAndRemove {
	
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
		int orgSize = hm.size();
		System.out.println("Hashmap occurence:: "+hm);
		System.out.println("Hashmap size:: " +orgSize);
		
		Set<Map.Entry<Integer, Integer>> entries = hm.entrySet();
		Iterator<Map.Entry<Integer, Integer>> itr = entries.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, Integer> entry = itr.next();
			if(entry.getValue()>1)
			{
				System.out.println("Duplicate Value:: " +entry.getKey());
				itr.remove();
//				hm.remove(entry.getKey(), entry.getValue());	// java.util.ConcurrentModificationException
			}
			else
			{
				count++;
			}
		}
		
		System.out.println("Hashmap occurence:: "+hm);
		System.out.println("Hashmap size:: " +hm.size());
		
		if(orgSize==count)
		{
			System.out.println("No Duplicate value found.");
		}
	}
	
	public static void main(String[] args) {
		int[] a = {2, 5, 2, 7, 18, 3, 11, 5, 3};
		findDuplicateInArray(a);
	}

}
