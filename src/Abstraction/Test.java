package Abstraction;

public class Test {

	public static void main(String[] args) {
		TwoWheeler hero = new TwoWheeler();
		int setMaxSpeed = hero.setMaxSpeed(200);
		System.out.println("Two wheeler speed is "+setMaxSpeed+"kmph.");
			
		ThreeWheeler auto = new ThreeWheeler();
		setMaxSpeed = auto.setMaxSpeed(150);
		System.out.println("Three wheeler speed is "+setMaxSpeed+"kmph.");
		
		FourWheeler swift = new FourWheeler();
		setMaxSpeed = swift.setMaxSpeed(300);
		System.out.println("Four wheeler speed is "+setMaxSpeed+"kmph.");
		
		
	
	}
}