package CLIPractice;

public class ReverseString {
	public static void main(String[] args) {
		String s = "String Reverse";
		String rev = "";
		String[] s1 = s.split(" ");

		int len = s1.length;
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s1[i];
			System.out.print(rev + " ");
			rev = "";
		}
	}

}
