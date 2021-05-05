package StringDemo;

public class GetFirstCharOfEachWord {
	
	public static void main(String[] args) {
		
		String s = "Dharmik Mehta";
		System.out.println(s.length());
		
// Method 1		
		String[] parts = s.split("\\s", 2);
		char c = 0;
		for(String s1 : parts) {
			c = s1.charAt(0); 
			System.out.println("First character of " + s1 + " :: " +c);
		}
		
// Method 2
		String s2 = ' ' + s;
		System.out.println(s2.length());
		char[] arr = s2.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==' ') {
				System.out.println("Character:: " +arr[i+1]);
			}
			
		}
		
	}
	
}