package ArrayDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Input: arr[] = { 1, 2, 3, 4, 5 }, index = 2
Output: arr[] = { 1, 2, 4, 5 }

Input: arr[] = { 4, 5, 9, 8, 1 }, index = 3
Output: arr[] = { 4, 5, 9, 1 }
*/
public class RemoveElementAtIndex {

	private void removeLogicUsingList() {
		int[] a = new int[] {4, 5, 9, 8, 1};
		int index = 3;

		if(a == null || index < 0 || index > a.length)
		System.out.println("Invalid index");

		List l = new ArrayList();
		for(Integer i : a)
			l.add(i);
		System.out.println(l);
		l.remove(index);
		System.out.println(l);
	}
	
	private void removeLogic() {
		int[] a = new int[] {1, 2, 3, 4, 5};
		int index = 2;
		
		if(a == null || index < 0 || index > a.length)
		System.out.println("Invalid index");
		
		int[] b = new int[a.length-1];
	
		for (int i = 0, k = 0; i < a.length; i++) {
			if(i==index) {
				continue;
			} else
				b[k++]=a[i];
		}
		for(int j : b) {			
			System.out.print(j + " ");
		}
	}
	
	public static void main(String[] args) {
//		new RemoveElementAtIndex().removeLogic();
		new RemoveElementAtIndex().removeLogicUsingList();
	}

}
