package Abstraction;

public class TwoWheeler extends Vehicle {

	public int setMaxSpeed(int setMaxSpeed) {
		if(setMaxSpeed>120) {
			System.err.println("Two wheeler speed cannot be more than 120.");
		}
		else {
			Constants.setMaxSpeed = setMaxSpeed;
		}
	return Constants.setMaxSpeed;
	}
}