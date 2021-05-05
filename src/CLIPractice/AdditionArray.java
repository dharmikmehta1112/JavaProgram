package CLIPractice;

public class AdditionArray {

	public static void main(String[] args) {
		int i, j;
		int arr[] = { 1, 2, 3, 4, 5 };
		int arr1[] = { 6, 7, 8, 9, 10 };
		int res1[] = new int[10];
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr1.length; j++) {
				res1[i] = arr[i] + arr1[j];
				if (i < j) {
					// System.out.println();
				} else if (i > j) {
					// System.out.println();
				} else

					System.out.print(arr[i]+"+"+arr1[j]+" = "+res1[i]+"\n");

			}

		}
	}

}
