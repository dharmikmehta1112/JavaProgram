package ArrayDemo;

// In bubble sort algorithm, array is traversed from first element to last element.
// Here, current element is compared with the next element.
// If current element is greater than the next element, it is swapped.

public class BubbleSortExample {
	
	public static void bubbleSort(int a[]) {	
		int len = a.length;
		int temp = 0;
		
		System.out.println("Length of array:: " +len);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i]<a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

//		for (int i = 0; i < len; i++) {
//			for (int j = 1; j < len-i; j++) {
//				if(a[j-1]>a[j]) {
//					temp=a[j-1];
//					a[j-1]=a[j];
//					a[j]=temp;
//				}		
//			}	
//		}
		
	}
	
	public static void main(String[] args) {	
		int a[] = {2, 10, 25, 8, 15, 45, 4};
		
		System.out.print("Array before Bubble Sort:: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		
		System.out.println();
		
		bubbleSort(a);
		
		System.out.print("Array after Bubble Sort:: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
	}
	
}