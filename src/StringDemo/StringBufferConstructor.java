package StringDemo;

public class StringBufferConstructor {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());		// 16
		System.out.println(sb.length());		// 0
		
		StringBuffer sb1 = new StringBuffer(20);	
		System.out.println(sb1.capacity());		// 20
		System.out.println(sb1.length());		// 0
		
		StringBuffer sb2 = new StringBuffer("Dharmik");
		System.out.println(sb2.capacity());		// 16+7=23
		System.out.println(sb2.length());		// 7
		
	}

}
