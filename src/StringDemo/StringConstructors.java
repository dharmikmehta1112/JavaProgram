package StringDemo;

import java.nio.charset.Charset;

public class StringConstructors {
	
	public static void main(String[] args) {

		byte[] b_arr = {68, 104, 97, 114, 109, 105, 107};
		Charset cs = Charset.defaultCharset();
//		String s = new String(b_arr);	// Dharmik
//		String s = new String(b_arr, cs); // Dharmik
//		String s = new String(b_arr, "US-ASCII");	// Dharmik
//		String s = new String(b_arr, 1, 3, cs); // har
		
		char[] a = {'D', 'h', 'a', 'r', 'm', 'i', 'k'};
		System.out.println(a);	// Dharmik			
//		String s = new String(a);
//		System.out.println(s);	// Dharmik
		
		StringBuffer sb = new StringBuffer("Dharmik");
		String s = new String(sb);
		System.out.println(s);
		
		StringBuilder sb1 = new StringBuilder("Dharmik");
		String s1 = new String(sb1);
		System.out.println(s1);

	}

}
