package Basics;

import java.util.Scanner;

// ********* Print from 1 to 100 all Prime number. *********

// A prime number is a number that is only divisible by 1 or itself. For example, 11 is only divisible by 1 or itself.
// Other Prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 etc..... 
// Note: 0 and 1 are not prime numbers. 2 is the only even prime number.

// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 ~ 25
// 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199 ~ 

public class PrimeNumPrint {
	
	public static void main(String[] args) {
		int i=2, count=0;
		System.out.print("Prime Number from 1 to 100: ");
	
		while(i<=100) {
			if(i==2 || i==3 || i==5 || i==7) {
				System.out.print(i + " ");
				count++;
			}
			// else if(i%2==1 && i%3!=0 && i%5!=0 && i%7!=0)
			else if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0) {
				System.out.print(i + " ");
				count++;
			}
		i++;		
		}
		System.out.println();
		System.out.println("Total Prime Number from 1 to 100: " + count);
	}
}