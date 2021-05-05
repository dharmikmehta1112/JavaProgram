package Collection_SetDemo;

/**
 * @author Dharmik Mehta
 * 
 * Student class of Comparator
 */
public class StudentForComparator extends StudentMarksComparator {
	int rollNumber;
	String name;
	String cast;
	float marks;
	char grade;
	
	public StudentForComparator(int rollNumber, String name, String cast, float marks, char grade) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.cast = cast;
		this.marks = marks;
		this.grade = grade;
	}
}