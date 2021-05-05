package CompanyIQ;

import java.util.ArrayList;
import java.util.List;

// Fixed Point in an array is an index i such that arr[i] is equal to i

public class MindstixQ1 {

		public void findFixPoint(int arr[], int arr_size) {
			int flag = -1;
			List<Integer> al = new ArrayList<Integer>();
			for(Integer i : arr) {
				al.add(i);			
			}
			System.out.println("Array List:: " +al);
			for(int i = 0; i<al.size(); i++) {
				if(al.get(i)==i) {
					System.out.println("Fixed Point:: " + i);
					break;
				}
				else
					System.out.println(flag);
			}
		}
		
		public static void main(String[] args) {
			int arr[] = {-10, -5, 0, 3, 7};
			int arrlen = arr.length;
			
			new MindstixQ1().findFixPoint(arr, arrlen);
		}
	
}
