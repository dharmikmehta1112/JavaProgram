package PackageB;

public class ClassD {
	public static void main(String[] args) {
		int [ ] b = new int [10];
		System.out.println("1D Length: " + b.length);			 //This will print 0.
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");	
		}		
		int a[][]=new int[7][8];
		System.out.println("\n" + a.length);			//This will print 7.
		System.out.println(a[0].length);		 		//This will print 8
	}
}