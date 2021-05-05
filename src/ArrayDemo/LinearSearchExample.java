package ArrayDemo;

// Linear search is used to search a key element from multiple elements.
// Linear search is less used today because it is slower than binary search and hashing.

public class LinearSearchExample {
	
	public static int linearSearch(int a[], int key) {
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==key)
				return i;
		} 
		return 0;
	}
	
	public static void main(String[] args) {
		
		int a[] = {10, 20, 30, 40, 50, 60};
		
		int key = 50;
		
		System.out.println("Key: " + key + " is found at index: " + linearSearch(a, key));
	}
}