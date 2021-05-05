package CompanyIQ;

// Sorting array without function

public class JioR2_1Q1 {

	private static void sortArray() {
		int[] a = new int[] {2, 5, 1, 7, 11, 9};
		System.out.print("Original Array:: ");
		for (int i = 0; i < a.length; i++)			
			System.out.print(a[i] + " ");	
		
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("Sorted Array:: ");
		for (int i = 0; i < a.length; i++)			
			System.out.print(a[i] + " ");
		
	}
	public static void main(String[] args) {
		sortArray();
	}
}
