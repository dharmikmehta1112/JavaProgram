package Basics;

public class DecimalToBinary {
	
	private static long decToBin(int dec) {
		
//		int[] bin = new int[10];
		
		long bin = 0;
		int rem = 0, index = 1;
		
		while(dec>0) {
			rem = dec%2;
			bin = bin + (rem*index);
			index = index * 10;
			dec = dec/2;
		}
		
		return bin;
	}
	
	public static void main(String[] args) {
		int dec_num = 50; 
		System.out.println("Decimal Number:: " +dec_num);		
		long bin_num = decToBin(dec_num);
		System.out.println("Binary Number:: " +bin_num);
		
	}

}
