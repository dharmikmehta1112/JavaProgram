package DataTypesDemo;

/**
 * 
 * @author Dharmik Mehta
 * Use of long variable to store quite large values as like 'distance', 'seconds' in below program.
 *
 */
public class Test {

	public static void main(String[] args) {
		int lightspeed = 186000;
		long days = 1000, seconds, distance;

		seconds = days * 24 * 60 * 60; // convert days to seconds
		distance = lightspeed * seconds;

		System.out.println("In " + days + " days light will travel about " + distance + " miles.");
	}
}

// Output: In 1000 days light will travel about 16070400000000 miles.