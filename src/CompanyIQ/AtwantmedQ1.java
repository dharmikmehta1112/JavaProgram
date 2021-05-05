package CompanyIQ;

// Binary 1's and 0's count for an array

public class AtwantmedQ1 {
	
	private static void m1() {
		int[] a = new int[] {1, 0, 1, 0, 1, 0, 1, 0, 1};
		int count = 0;
		int ones = 0;
		while(count<a.length) {
			if(a[count]==1) {			
				System.out.println("Ones found at " +count);
				ones++;
			}
			count++;
		}
		System.out.println("Number of 1's:: " +ones);
		System.out.println("Number of 0's:: " +(a.length - ones));	
	}		
	
	private static void m2() {
		int[] a = new int[] {1, 0, 1, 0, 1, 0, 1, 0, 1};
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==1)
				count++;			
		}
		System.out.println("Number of 1's:: " +count);
		System.out.println("Number of 0's:: " +(a.length - count));	
	}

	
	public static void main(String[] args) {
//		m1();
		m2();

	}
}
