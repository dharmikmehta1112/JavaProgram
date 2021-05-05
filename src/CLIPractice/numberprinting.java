package CLIPractice;

public class numberprinting {
	public static void main(String[] args) {
		int num = 199564;
		int ch = 0;
		int[] a = new int[6];
		for (int j=a.length-1;j>=0;j--) {
			a[j] = num % 10;
			num = num / 10;
		}
		for (int i =0 ; i<a.length; i++) {
			ch = a[i];
			// j=num%10;
			// div=num/10;
			// num=div;

			switch (ch) {
			case 0:
				System.out.print("Zero ");
				break;
			case 1:
				System.out.print("One ");
				break;
			case 2:
				System.out.print("Two ");
				break;
			case 3:
				System.out.print("Three ");
				break;
			case 4:
				System.out.print("Four ");
				break;
			case 5:
				System.out.print("Five ");
				break;
			case 6:
				System.out.print("Six ");
				break;
			case 7:
				System.out.print("Seven ");
				break;
			case 8:
				System.out.print("Eigth ");
				break;
			case 9:
				System.out.print("Nine ");
				break;
			default:
				System.out.println("Wrong Input");
			}
		}
	}
}
