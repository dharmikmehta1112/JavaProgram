package ArrayDemo;

import java.util.Arrays;

class ArrayMethod {
	
public static void main(String[] args) {

	// int[] arr = new int[5];
	
	int [] arr = {11, 92, 43, 74, 105};
	
// ************* Calculate array length using method *************
	System.out.println("Array length is " + arr.length);
	
	for(int i = 0; i < arr.length; i++)	{
		System.out.println("Array value at [" + i + "] postion is " + arr[i]);
	}

// ********* Using sort(array) method an Arrays ***********
	Arrays.sort(arr);
	System.out.println("Array values after sorting.......");
	
	for(int i = 0; i < arr.length; i++) {
		System.out.println("Array value at [" + i + "] postion is " + arr[i]);
	}	

// ********** binarySearch(array, key) Method ************
	System.out.println("Array index for search value 110 is " +Arrays.binarySearch(arr , 110));
	
//	Copies an array from the specified source array, beginning at the specified position, to the specified position of the destination array.
//	System.arraycopy(Object src,  int  srcPos, Object dest, int destPos, int length);

// Copies the specified array, truncating or padding with zeros (if necessary) so the copy has the specified length.	
// Arrays.copyOf(int[] original, int newLength);
	
	
	
	
	
	
	
	
	
	
	
	
}
}