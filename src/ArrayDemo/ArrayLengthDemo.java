package ArrayDemo;

// Copy array from X to Y
// Stock Problem where stocks fluctuate whole day and we have to find max profit

public class ArrayLengthDemo{
	
	public static void main(String[] args) {
		
		int[] x = {5, 15, 10, 30, 80, 95};
		int[] y = new int[5];
		
		// for (int i=0; i<x.length; i++) {
		// 	y[i] = x[i];		// Copy from Array X to Y
		// }
		
		// for (int i=0; i<x.length; i++) {
		// 	System.out.println(y[i]);	// Print Array Y
		// }

		// for (int i=0; i<x.length; i++) {
		// 	// x[i]++;
		// 	System.out.println(x[i]+1);
		// }
		
		System.out.println("Full length: " + x.length);				// 6
		System.out.println("Half length: " + x.length/2);			// 3
		System.out.println("One Third length: " + x.length/3);		// 2
		System.out.println("Quater length: " + x.length/4);			// 1
	}
}