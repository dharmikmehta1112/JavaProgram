package CompanyIQ;

//Roll No Comparator

import java.util.Comparator;

public class NeosoftR1Q1RNoComparator implements Comparator<NeosoftR1Q1> {

	@Override
	public int compare(NeosoftR1Q1 o1, NeosoftR1Q1 o2) {
		if (o1.rollNo > o2.rollNo)
			return 1;
		else if (o1.rollNo < o2.rollNo)
			return -1;
		else
			return 0;
	}

}
