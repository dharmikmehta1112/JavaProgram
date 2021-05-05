package ExceptionDemoBank;

/**
 * @author dharmik mehta
 * 
 */

public class Runner {
	public static void main(String[] args) {
		Customer sunil = new Customer("sunil", 5000, 1111);
		ATM atm = new ATM();
		atm.withdraw(sunil);
	}
}