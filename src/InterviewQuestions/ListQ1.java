package InterviewQuestions;

import java.util.*;

public class ListQ1 {
	public static void main(String[] args) {
		String array[] = {"abc", "2", "10", "0"};
		List<String> list = Arrays.asList(array);
//		System.out.println(list);
//		Set<String> set = new HashSet<String>(list);
//		System.out.println(set);
//		Set<String> lset = new LinkedHashSet<String>(list);
//		System.out.println(lset);
		Collections.sort(list);
		System.out.println(Arrays.toString(array));
	}
}