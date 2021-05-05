package MapDemo;

public class InvalidRollNumberException extends RuntimeException {
	int rollNumber;
		
	public InvalidRollNumberException(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	@Override
	public String getMessage() {
		return "Invalid Roll Number Entered: " + rollNumber;
	}
}