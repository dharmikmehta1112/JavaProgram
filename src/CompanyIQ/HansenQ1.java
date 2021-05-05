package CompanyIQ;

/*
INPUT
a[]={1,2,3,4,5}
b[]={6,7,8,9,10}

OUTPUT
a[]={10,9,8,7,6}
b[]={5,4,3,2,1}
*/

public class HansenQ1 {
	
	private static void m1() {
		
		int[] a = {1,2,3,4,5};
		int[] b = {6,7,8,9,10};
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				int temp = a[i];
				a[i] = b[j];
				b[j] = temp;
			}
		}

		System.out.print("First Array:: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		System.out.print("Second Array:: ");		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
	
	public static void main(String[] args) {		
		m1();
	}

}
