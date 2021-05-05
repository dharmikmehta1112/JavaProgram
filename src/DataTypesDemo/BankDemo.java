package DataTypesDemo;

/**
 * @author Dharmik Mehta
 * 
 *         Static members of the same class can be access directly from Static
 *         context.
 * 
 *         Static members of the same class can be accessed directly from
 *         non-static also.
 * 
 *         Non-Static members can be accessed directly from another Non-Static
 *         context.
 * 
 *         Non-Static members cannot be accessed directly from Static context,
 *         we should create object and we should use object reference.
 */

public class BankDemo {
	int balance = 5000;

	void balance() {
		System.out.println("Saving account balance: Rs." + balance);
	}

	void damount(int damount) {
		balance = balance + damount;
		System.out.println("The amount Rs." + damount + " is deposited into account.");
		balance();
	}

	void wamount(int wamount) {
		if (wamount <= balance) {
			balance = balance - wamount;
			System.out.println("The amount Rs." + wamount + " is withdraw from account.");
		} else
			System.out.println("Insufficient Balance");
		balance();
	}

	public static void main(String[] args) {

		BankDemo b = new BankDemo();
		b.balance();
		System.out.println("Transaction details.");
		b.damount(20000);
		System.out.println("Transaction details.");
		b.damount(50000);
		System.out.println("Transaction details.");
		b.wamount(10000);
	}
}