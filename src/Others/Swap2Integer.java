package Others;

public class Swap2Integer {
	
	int a = 10;
	int b = 20;
	
	public void run() {
		int a = this.b;
		int b = this.a;
		System.out.println("a = " + a + ", b = " + b );
	}
	
	public static void main(String[] args) {
		
		Swap2Integer si = new Swap2Integer();
		System.out.println("Before Swap");
		System.out.println("a = " + si.a + ", b = " + si.b);
		System.out.println("After Swap");
		si.run();
	}

}
