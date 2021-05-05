package CLIPractice;

public class UppercaseString {

	public static void main(String[] args) {
		String s = "testing shastra";

		String[] str = s.split(" ");

		for (int i = 0; i < str.length; i++) {
			char c = str[i].toUpperCase().charAt(0);

			System.out.print(c + str[i].substring(1, str[i].length()) + " ");

		}

	}
}
