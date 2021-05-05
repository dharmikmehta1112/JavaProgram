package OOP_EncapsulationDemo;

public class Akash {
	public static void main(String[] args) {
		Employee akash = new Employee();
	
		akash.setEmplID(10);
		System.out.println(akash.getEmplID());
		
		akash.setEmplDesig("Manager");
		
		akash.setEmplSalary(75000);
		System.out.println(akash.getEmplSalary());
		
	}
}