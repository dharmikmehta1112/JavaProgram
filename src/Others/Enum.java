package Others;

public class Enum {

	public enum Day {Sun, Mon, Tue, Wed, Thu, Fri, Sat};

	public static void main(String[] args) {
		
		Day dayNow[] = Day.values();
		
		System.out.print("Week Days are:: ");
		for(Day now : dayNow) {
			System.out.print(now + " ");
		}
	}
}
