package Abstraction;

public class ThreeWheeler extends Vehicle {

	public int setMaxSpeed(int setMaxSpeed) {
		if(setMaxSpeed>70) {
			System.err.println("Three wheeler speed cannot be more than 70.");
		}
		else {
			Constants.setMaxSpeed = setMaxSpeed;
		}
		return Constants.setMaxSpeed;
	}
}