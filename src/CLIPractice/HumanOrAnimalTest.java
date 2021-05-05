package CLIPractice;

import java.util.Scanner;

public class HumanOrAnimalTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String Animal = null, Human = null;

		Scanner sc = new Scanner(System.in);
		String ch;
		System.out.println("Enter your type(Human or Animal)");
		ch = sc.nextLine();

		if (ch.equals("Animal")) {
			System.out.println("What kind of animal you are(Cat or Dog)");
			Animal = sc.nextLine();
			if (Animal.equals("cat")) {
				System.out.println("Meow");
			} else {
				System.out.println("Bhoo");
			}
		} else {
			System.out.println("Are you male or female");
			Human = sc.nextLine();
			if (Human.equals("female")) {
				System.out.println("Eat Sleep and Talk");
			} else {
				System.out.println("Eat and Sleep");

			}
		}
	}

}
