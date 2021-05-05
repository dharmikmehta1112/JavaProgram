package InterviewQuestions;

public class StringEqualsMatchesQ {
	
	public static void main(String[] args) {
		
		String s1 = ".*e.*";
		
		String s2 = new String(".*e.*");
		
		System.out.println("Equals Result:: " + s1.equals(s2));
		
		System.out.println("Matches Result:: " + s1.matches(s2));
		
		System.out.println("hello".equals(".*hello.*"));
		
		System.out.println("hello".matches(".*e.*"));

		
	}
}