package ArrayDemo;

// 2D and 3D Array

public class ArrayMultiDimension {
	public static void main(String[] args){
		int[][] x = {{5,10}, {15,30,80}, {110,145}};	// 2D Array Tree
		
//		int[][][] y = {{{14,23,37}, {24,85,66}}, {{35,48,43}, {36,48,75}}};		// 3D Array Tree [2][2][3]

// 		int [][][] y = {{{2,5,4}, {3,4,3}}, {{3,4,6}, {5,8,9}, {5,8,9}}};		//[2][][3]
// 		System.out.println(y.length);

		System.out.println("Multi Dimensional Array:: ");
		for (int i=0; i<x.length; i++) {
			for (int j=0; j<x[i].length; j++) {
				System.out.print(x[i][j] + " ");
			}
				
		}
	}
}