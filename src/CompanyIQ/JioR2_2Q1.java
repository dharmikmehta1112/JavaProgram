package CompanyIQ;

// Finding second max value from an array

public class JioR2_2Q1 {
	
	private static void secondMax(int[] arr) {

/*	
		Arrays.sort(arr);	// Ascending Order
		System.out.println("Second Largest:: " +arr[arr.length-2]);
*/
		int largest = 0;
		int secLargest = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>largest) {
				secLargest = largest;		// 0, 2 7
				largest = arr[i];			// 2, 9
			}
			else if(arr[i]>secLargest) {
				secLargest=arr[i];
			}
		}
		
		System.out.println("Largest:: " +largest);
		System.out.println("Second Largest:: " +secLargest);		
		
	}
	
	public static void main(String[] args) {
		int[] a = {2, 9, 1, 7, 3};
		secondMax(a);	
	}
	
}