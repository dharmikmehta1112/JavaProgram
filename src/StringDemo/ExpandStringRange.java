package StringDemo;
/*
Input : string x = "1-5, 8, 11-14, 18, 20, 26-29" 
Output : string y = "1, 2, 3, 4, 5, 8, 11, 12, 13, 14, 18, 20, 26, 27, 28, 29"
*/
public class ExpandStringRange {
	
	public static void main(String[] args) {
		
		String s = "1-5, 8, 11-14, 18, 20, 26-29";
		String[] parts = s.trim().split(",");
		System.out.println("Length of parts:: " +parts.length);
		for (int i = 0; i < parts.length; i++) {
			if(parts[i].contains("-")) {				
				String[] words = parts[i].trim().split("\\-");
				System.out.println("Length of " +i+ "th words:: " +words.length);
				int start = Integer.parseInt(words[0]);
				int end = Integer.parseInt(words[1]);
				for (int j = start; j <= end; j++) {
					System.out.print(j + " ");
				}
			} else {
				int value = Integer.parseInt(parts[i]);
				System.out.print(value + " ");
			}
			System.out.println();
		}	
	}
}
