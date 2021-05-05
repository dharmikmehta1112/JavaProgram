package StringDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindExtraChar {

	private void findExtraChar() {
		String s = "abcd";
		String p = "bedca";
		char[] sarr = s.toCharArray();
		char[] parr = p.toCharArray();
		
		List als = new ArrayList();
		List alp = new ArrayList();
		
		for(char c : sarr)
			als.add(c);
		
		for(char c : parr)
			alp.add(c);
		
		System.out.println(als);
		System.out.println(alp);
		
		alp.removeAll(als);		// Remove all common element
		
//		alp.retainAll(als);		// Retain common and Remove uncommon
		
		System.out.println(als);
		System.out.println(alp);
		
	}
	
	private void extraChar() {
		
		String s = "abcd";
		String p = "bedca";
		
		char[] sarr = s.toCharArray();
		char[] parr = p.toCharArray();
		
		int[] a = new int[10];
		
		for (int i = 0; i < sarr.length; i++) {
			for (int j = 0; j < parr.length; i++) {
				if(sarr[i]==sarr[j]) {
					break;
				}else {
					System.out.println(sarr[i]);						
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) {			
			if(a[i]==1)
				System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
//		new FindExtraChar().extraChar();
		new FindExtraChar().findExtraChar();
	}
}
