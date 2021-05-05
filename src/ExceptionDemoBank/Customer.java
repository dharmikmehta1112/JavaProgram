package ExceptionDemoBank;

/**
 * @author dharmik mehta
 * 
 *
 */
public class Customer {
	public String name;
	public float balance;
	int pin;

	public Customer(String name, float balance, int pin) {
		this.name = name;
		this.balance = balance;
		this.pin = pin;
	}
}