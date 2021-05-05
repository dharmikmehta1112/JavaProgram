package MapDemo;

public class InvalidNameException extends RuntimeException {
	String name;

	public InvalidNameException(String name) {
		this.name = name;
	}
	
	@Override
	public String getMessage() {
		return "Invalid name entered: " + name + ". Only alphabets allowed.";
	}
}