package Abstraction;

public abstract class Vehicle {

// Abstract Method - cannot be static and final, only public and protected modifiers are allowed
	public abstract int setMaxSpeed(int setMaxSpeed);

// Concrete method
	public int displaySpeed() {

		return 1;
	}

}