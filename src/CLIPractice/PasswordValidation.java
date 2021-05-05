package CLIPractice;

public class PasswordValidation {
	public static void main(String[] args) {

		String s = "sonA@123$";
		String pattern = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";

		System.out.println(s.matches(pattern));
	}

}
