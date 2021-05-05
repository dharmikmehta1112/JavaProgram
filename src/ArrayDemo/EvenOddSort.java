package ArrayDemo;

// Array ~ Home Work
// From given X and Y array sorting even element in array X and odd element in array Y. 

public class EvenOddSort {
	
	public static void main(String[] args){
	
		int temp;
		
		// int x[] = {1,2,3,4,5,6};
		// int y[] = {7,8,9,10,11,12}

		int x[] = {1,3,5,2,4,6};
		int y[] = {7,8,10,9,12,11};

		for (int i=0; i<x.length; i++){			// 0 1 2
			if (x[i]%2!=0) {
				for (int j=0; j<y.length; j++){ 	// 0 1
					if(y[j]%2==0){
						temp = x[i];
						x[i] = y[j];
						y[j] = temp;
						break;				// Require to break the j condition
					}
				}
			}
		}
		System.out.print("Even Array : ");
		for (int i=0; i<x.length; i++) {
			System.out.print(x[i] + " ");	
		}
		
		System.out.print("\n Odd Array : ");
		for (int j=0; j<y.length; j++) {
			System.out.print(y[j] + " ");
		}
	}
}