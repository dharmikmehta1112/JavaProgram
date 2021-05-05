package InterviewQuestions;

public class MainQ1 {
	
	Object message() {
		return "Hello!";
	}

	public static void main(String[] args) {
		System.out.print(new MainQ1().message());
		System.out.print(new Main2().message());		
	}
}

class Main2 extends MainQ1{
	String message() {
		return "World!";
	}
}