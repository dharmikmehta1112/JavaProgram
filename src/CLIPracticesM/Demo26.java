package CLIPracticesM;
import java.io.IOException;

public class Demo26 {
	public static void main(String[] args) throws IOException {
		try{
			int a = 15;
			int b = 0;
			int res = a/b;
		} catch (ArithmeticException e) {
			System.err.println("Catch 2");
			System.exit(100);
		} finally {
			System.out.println("Finally");
		}
	}
}