package StringDemo;

public class SwapTwoStringWOUsingThird {

	public static void main(String[] args) {
		
		String s1 = "Dharmik";
		String s2 = "Mehta";
		
		System.out.println("Before swap:: " +s1+ " " +s2);
		
		s1+=s2;
		s2 = s1.substring(0, s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		
		System.out.println("After  swap:: " +s1+ " " +s2);
				
	}
}
