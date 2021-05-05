package CompanyIQ;

// WAP to reverse a string without spaces

public class NeosoftR2Q1 {
	
	private static void reverseWOSpaces(String s) {

		System.out.println("Orginal String:: " +s);
		char[] a = s.toCharArray();
		String rev = "";
		for (int i = a.length-1; i >= 0 ; i--) {
			if(a[i]==' ') {
				continue;
			} else {
				rev = rev + a[i];
			}
		}
		System.out.println("Reverse String without spaces:: " +rev);
	}
	
	public static void main(String[] args) {
		String s = "I Love Automation";
		reverseWOSpaces(s);
	}

}
