package ArrayDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class OrderingUsingMap {

	private void usingHashMap() {
		int[] a = {1, -1, 0, 2,-2};
		Map<Integer, String> hm = new TreeMap<Integer, String>();
		for(int x : a)
			hm.put(x, Integer.toString(x));
		for(int k : hm.keySet())
			System.out.print(k + " ");
		System.out.println();
		for(String v : hm.values())
			System.out.print(v + " ");
	}
	
	public static void main(String[] args) {
		new OrderingUsingMap().usingHashMap();
	}

}
