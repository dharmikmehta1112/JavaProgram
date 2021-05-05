package Abstraction;

public class FourWheeler extends Vehicle {

	public int setMaxSpeed(int setMaxSpeed) {
		if(setMaxSpeed>40) {
			System.err.println("Four wheeler speed cannot be more than 40.");
		}
		else {
			Constants.setMaxSpeed = setMaxSpeed;
		}
		return Constants.setMaxSpeed;
	}
	
}