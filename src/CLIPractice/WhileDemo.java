package CLIPractice;

public class WhileDemo {
	public static void main(String[] args) {
		int start = 0;
		int end = 9;
		System.out.print("Even Number = ");
		while (start <= end) {
			if (start % 2 == 0) {
				System.out.print(start+",");
			}

			start++;
		}
		// System.out.println("condition False");
	}

}

