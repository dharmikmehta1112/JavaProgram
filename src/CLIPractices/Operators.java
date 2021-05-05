package CLIPractices;

public class Operators {
	
	public static void main(String[] args) {
		
		int x = 2, y = 5, z = 0;

		System.out.println(x==2);					// True
		System.out.println(x!=5);					// True
		System.out.println(x!=5 && y>=5);			// True
		System.out.println(z!=0 || x==2);			// True
		System.out.println(!(y<10));				// False
	}
}