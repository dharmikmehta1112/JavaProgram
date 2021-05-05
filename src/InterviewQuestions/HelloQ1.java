package InterviewQuestions;

public class HelloQ1 {
	public static void main(String[] args) {
		String message = "Hello";
		print (message);
		message += "World!";
		print(message);
	}
	
	static void print (String message) {
		System.out.print(message);
		message += "";
	}
}