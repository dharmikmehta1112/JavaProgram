package ArrayDemo;

public class MissingNumberInRange2 {
	
	public static void main(String[] args) {
		
		int[] a = {1,4,7,9,14};
		
		System.out.print("Array:: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.print("Array with missing numbers:: ");
		int n = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=(n+1)) {
				while(n<=a[i]) {					
					System.out.print(n + " ");
					n++;
				}
			}
		}
		
		
	}

}
