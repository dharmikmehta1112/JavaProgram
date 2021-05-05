package Collection_SetDemo;

/**
 * To make StudentComparable class as Comparable
 * 
 * @author Dharmik Mehta
 */

public class StudentComparable implements Comparable {
	int rollNumber;
	String name;
	String cast;
	float marks;

	public StudentComparable(int rollNumber, String name, String cast, float marks) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.cast = cast;
		this.marks = marks;
	}

	@Override
	public int compareTo(Object o) {
		StudentComparable s = (StudentComparable) o; // type cast object (o) to student type
		if (this.marks < s.marks) {
			return 93; // return any positive value if less than
		} else if (this.marks > s.marks) {
			return -34; // return any negative value if greater than
		} else
			return 0; // return zero if equals
	}
}