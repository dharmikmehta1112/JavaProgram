package StringDemo;

public class StringBuilderConstructor {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());		// 16
		System.out.println(sb.length());		// 0
		sb.append("Dharmik");
		System.out.println(sb.capacity());		// 16
		System.out.println(sb.length());		// 0+7=7
		System.out.println(sb);					// Dharmik
		
		StringBuilder sb1 = new StringBuilder(20);	
		System.out.println(sb1.capacity());		// 20
		System.out.println(sb1.length());		// 0
		
		StringBuilder sb2 = new StringBuilder("Dharmik");
		System.out.println(sb2.capacity());		// 16+7=23
		System.out.println(sb2.length());		// 7
		sb.append("Mehta");
		System.out.println(sb.capacity());		// 16*
		System.out.println(sb.length());		// 7+5=12
		System.out.println(sb);
	}

}
