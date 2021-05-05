package Others;

public class Swap2String {
	
	String a = "Dharmik";
	String b = "Mehta";
	
	public void run() {
		String a = this.b;
		String b = this.a;
		System.out.println("a = " + a + ", b = " + b );
	}
	
	public static void main(String[] args) {
		
		Swap2String ss = new Swap2String();
		System.out.println("Before Swap");
		System.out.println("a = " + ss.a + ", b = " + ss.b);
		System.out.println("After Swap");
		ss.run();
	}

}
