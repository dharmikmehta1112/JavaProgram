package ExceptionDemoBank;

import java.util.Scanner;

/**
 * @author dharmik mehta
 * 
 */
public class ATM {
	public void withdraw(Customer c) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to withdraw: ");
		float amount = sc.nextFloat();
		int attempt = 3;
		if(amount > c.balance) {	
			System.out.println("Insufficient Balance.");
		} else {
			while(attempt > 0) {
				System.out.println("Enter 4 digit ATM Pin: ");
				int pin = sc.nextInt();
				if(pin==c.pin) {
					c.balance = c.balance - amount;
					System.out.println("Withdraw success. Your remaining balance: " + c.balance);	
					break;
				} else {
					attempt--;
					System.out.println("Incorrect pin. "+attempt+ " attempts remain.");
				}
			   }
			if(attempt==0) {
				throw new CardBlockedException();
			}
		}
	}
}