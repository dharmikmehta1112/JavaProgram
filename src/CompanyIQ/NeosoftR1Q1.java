package CompanyIQ;

// 1) Create Employee class
// 2) Add object to array list
// 3) Sort the list

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NeosoftR1Q1 {
	
	int rollNo;
	String name;
	String email;
	
	public NeosoftR1Q1(int rollNo, String name, String email){
		this.rollNo = rollNo;
		this.name = name;
		this.email = email;
	}
	
	private static void sortObject() {
		
		NeosoftR1Q1 n1 = new NeosoftR1Q1(1, "DM", "dm@01");
		NeosoftR1Q1 n2 = new NeosoftR1Q1(2, "PM", "pm@11");
		NeosoftR1Q1 n3 = new NeosoftR1Q1(3, "NM", "nm@21");
		
		List<NeosoftR1Q1> al = new ArrayList();
		al.add(n1);	
		al.add(n2);
		al.add(n3);
		
		System.out.print("Array List:: ");
		for(NeosoftR1Q1 n : al)
		System.out.print(n.name + " ");
		
//		Collections.sort(al, new NeosoftR1Q1NameComparator());
		Collections.sort(al, new NeosoftR1Q1RNoComparator());
		
		System.out.println();

		System.out.print("Array List (Sorted):: ");
		for(NeosoftR1Q1 n : al)
		System.out.print(n.rollNo + " ");
		
	}
	
	public static void main(String[] args) {
		sortObject();
	}
	
}
