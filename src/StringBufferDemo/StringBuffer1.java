package StringBufferDemo;

public class StringBuffer1 {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("Facebook");
		StringBuffer sb2 = new StringBuffer("Facebook");
		
		System.out.println(sb1==sb2);			// False
		System.out.println(sb1.equals(sb2));	// False ~ When object of StringBuffer is passed references are compared because
											    //         StringBuffer does not override equals method of Object class.

		String s1 = sb1.toString();
		String s2 = sb2.toString();
		
		System.out.println(s1==s2);			// False
		System.out.println(s1.equals(s2));	// True
		
		sb1.append("Corp");
		System.out.println(sb1);
			
	}

}
