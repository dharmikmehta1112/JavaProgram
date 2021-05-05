package StringDemo;

/**
 * @author Dharmik Mehta
 */
public class CountSumofNumbers {
	
	private void countSum(String str) {
		int sum = 0;
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if(Character.isDigit(arr[i])) {
				sum = sum + (arr[i] - 48);
			}
		}
		System.out.println(sum);	
	}
	
		public static void main(String[] args) {
		int sum = 0;
		String s = "He110 Te5t1ng9 5hastra"; // 22
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				char c = s.charAt(i);
				System.out.println(c);
				sum = sum + (s.charAt(i)-48);
//				int value = Integer.valueOf(c);
//				int value = Character.getNumericValue(c);
//				sum = sum + value;
			}
		}
		System.out.println("Sum of Numbers: " + sum);
		
		new CountSumofNumbers().countSum(s);
	}
}