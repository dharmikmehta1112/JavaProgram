package CompanyIQ;

import java.util.HashMap;
import java.util.Map;

// WAP to count occurence of city in a string

public class JioR1Q1 {
	
	private static void countCityOccurence() {
	
		String cities = "Patna Nagpur Mumbai Delhi Nagpur Delhi";
		int count = 0;
		String[] parts = cities.split("\\s");
		Map<String, Integer> hm = new HashMap();
		for (int i = 0; i < parts.length; i++) {
			String city = parts[i];
			if(hm.containsKey(city)) {
				count = hm.get(city);
				count++;
				hm.put(city, count);
			} else
				hm.put(city, 1);
		}
		
		System.out.println("Cities with occurence:: " +hm);
		
	}
	
	public static void main(String[] args) {
		countCityOccurence();
	}

}
