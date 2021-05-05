package CompanyIQ;

// Name Comparator

import java.util.Comparator;

public class NeosoftR1Q1NameComparator implements Comparator<NeosoftR1Q1>{

	@Override
	public int compare(NeosoftR1Q1 o1, NeosoftR1Q1 o2) {
		
		return o1.name.compareTo(o2.name);
		
	}

}
