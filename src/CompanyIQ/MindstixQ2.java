package CompanyIQ;

import java.util.ArrayList;
import java.util.List;

/*
	Print 2nd largest and 2nd smallest elements from a given integer array without sorting.

	Input:  arr[]:  5, 10, 0, 2, 3, 4
			arr_len: 6

	Output: 2, 5
 */

public class MindstixQ2 {
	
	public int printSecondLargest(int arr[], int arr_len) {	
		
		List<Integer> al = new ArrayList<Integer>();
		for(Integer i : arr) {
			al.add(i);			
		}
		
		System.out.println("Array List:: " +al);
		Integer large = 0;
		Integer secLarge = 0;
		
		for(Integer i : al) {
			if(i>large) {
				secLarge = large;
				large = i;
			} else if(i>secLarge) {
				secLarge = i;
			}
		}
//		System.out.println("First Largest:: " +large);	
		return secLarge;
	}

	public int printSecondSmallest(int arr[], int arr_len) {		
		List<Integer> al = new ArrayList<Integer>();
		for(Integer i : arr) {
			al.add(i);			
		}
		System.out.println("Array List:: " +al);
		Integer small = al.get(0);
		Integer secSmall = 0;
		for(Integer i : al) {
			if(i<small) {
				secSmall = small;
				small = i;
			}  else if(i<secSmall) {
				secSmall = i;
			}
		}
//		System.out.println("First Smallest:: " +small);

		return secSmall;
	}
		
	public static void main(String[] args) {
		
		int arr[] = {5, 10, 0, 2, 3, 4};
		int arrlen = arr.length;
	
		System.out.println("Second Largest:: " + new MindstixQ2().printSecondLargest(arr, arrlen));
		
		System.out.println("Second Smallest:: " + new MindstixQ2().printSecondSmallest(arr, arrlen));		
	}
}