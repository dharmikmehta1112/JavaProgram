package CLIPracticesM;
public class Test {
	private static String str = "Test";
	public void print() {
		System.out.println(str);
	}

	public static void main(String[] args) {
		print();			//  error: non-static method print() cannot be referenced from a static context
	}
}