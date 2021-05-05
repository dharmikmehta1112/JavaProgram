package CLIPractice;

public class Evenandodd {
	public static void main(String args[]) {
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 6, 7, 8, 9, 10 };
		//int a[][]= {{1,2,3,4,5},{6,7,8,9}};
		int i, j = 0;

		for (i = 0; i < a.length; i++) {
			for (j = 0; j < b.length; j++) {
				if (a[i] % 2 == 0) {

					a[i] = a[i];
					//break;

				} else if (a[i] % 2 != 0) {
					int temp = a[i];
					if (b[j] % 2 != 0) {
						b[j] = b[j];
					  

					} else {
						int temp1;
						temp1 = b[j];
						b[j] = temp;
						a[i] = temp1;
						//break;
					}

				}
			}
		
			}
		for(i=0;i<a.length;i++)
		{
			System.out.print(" " + a[i] + " ");

		}
		System.out.println();
		for(j=0;j<b.length;j++)
		{
			System.out.print(" " + b[j] +" ");
		}
			
	}
}
