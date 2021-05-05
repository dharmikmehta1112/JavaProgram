package ArrayDemo;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateUsingHashSet {
	
	private static void findDuplicateInArray(int[] a) {
		
		Set hs = new HashSet();
		
		for(int val : a)
		{
			if(hs.add(val)==false) 
			{
				System.out.println("Duplicate Value:: " +val);
			}
			else {
				hs.add(val);
			}
		}
		System.out.println("Hashset:: "+hs);
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {2, 5, 2, 7, 3, 18, 11, 3};
		findDuplicateInArray(a);
		
	}
	

}
