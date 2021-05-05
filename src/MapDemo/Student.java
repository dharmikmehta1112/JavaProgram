package MapDemo;

/**
 * @author Dharmik Mehta
 *
 */
public class Student extends MarksComparator {
	int rollNumber;
	String name;
	String category;
	float marks;

	public Student(int rollNumber, String name, String category, float marks) {
		if(rollNumber>0 && rollNumber<101) {
		this.rollNumber = rollNumber;
		} else {
			throw new InvalidRollNumberException(rollNumber);
		}
		if(name.matches("[^A-Za-z]")) {
//		if(name.contains("[^A-Za-z]")) {
			this.name = name;			
		} else {
			throw new InvalidNameException(name);
		}
		this.category = category;
		this.marks = marks;
	}
}