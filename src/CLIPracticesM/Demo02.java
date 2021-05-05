package CLIPracticesM;
public class Demo02 {
/*
	public static void Test (Object o) {
		System.out.println("Object");
	}
*/
	public static void Test (String str) {
		System.out.println("String");
	}

	public static void Test (Integer i) {
		System.out.println("Integer");
	}
/*
	public static void Test (Float i) {
		System.out.println("Float");
	}
*/
	public static void main(String[] args) {
		Test(null);			//  Error: reference to Test is ambiguous
	}
}