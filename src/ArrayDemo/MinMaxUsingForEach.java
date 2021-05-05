package ArrayDemo;

import java.util.Arrays;
import java.util.List;

public class MinMaxUsingForEach {

	public void minUsingForEach() {
		List<Integer> al = Arrays.asList(9, 5, 2, 15, 6, 8);
		int min = al.get(0);
			for(Integer i : al) 
				if(min>i)
					min = i;
				System.out.println("First min:: " +min);
	}

/*	
	public void secminUsingForEach() {
		List<Integer> al = Arrays.asList(9, 5, 2, 15, 6, 8);
		int min = al.get(0);
			for(Integer i : al) 
				if(min>i)
					min = i;
				System.out.println("First min:: " +min);
		int secmin = min;
			for(Integer i : al)
				if(secmin<i && )
					secmin=i;
				System.out.println("Second min:: " +secmin);
	}
*/	

	public void maxUsingForEach() {
		List<Integer> al = Arrays.asList(9, 5, 2, 15, 6, 8);		
				int max = al.get(0);
				 for(Integer i : al) 
					 if(max<i)
						 max = i;
			 System.out.println("First max:: " +max);	
	}

	public static void main(String[] args) {
		 
		new MinMaxUsingForEach().minUsingForEach();
//		new ArrayMinMaxUsingForEach().secmaxUsingForEach();
		new MinMaxUsingForEach().maxUsingForEach();

	}
}