package Basics;

// ********* Print from 1 to 100 all Palindrome number. *********
// A Palindrome Number is a number that even when reversed is same as original number.
// Ex: 121, 393, 34043, 111, 555, 48084 etc

public class PalindromeNumPrint {
	
	public static void main(String[] args) {
		
		int onum, num=1, rem, rev = 0;
		System.out.print("Palindrome number from 1 to 100: ");
		while(num<=100) {
			onum = num;
			while(onum>0) {
				rem = onum % 10;			//1, 1
				rev = rev * 10 + rem;		// = 0*10+1 = 1 , 11
				onum = onum / 10;			//1, 0
			}
			if(rev == num) {
				System.out.print(num + " ");
			}
		rev = 0;		//Intialization
		// num++;
		}

		// int i = 1;
		// System.out.print("Palindrome number from 1 to 100: ");
		// while(i<=100)
		// {
		// 	if(i<10 || i%11==0)
		// 	{
		// 		System.out.print(i + " ");	
		// 	}
		// 	i++;
		// }

		// int rem, rev = 0;
		// System.out.print("Palindrome number from 1 to 100: ");
		// for(int num=1; num<=100; num++)			// num = 1
		// {
		// 	for(int onum=num; onum>0; onum = onum/10 )		// onum = 1.... 10 
		// 	{
		// 		rem = onum % 10;			// = 1.... 0 
		// 		rev = rev * 10 + rem;		// = 0*10+1 = 1.... = 0 
		// 		// onum = onum / 10;			// 0.... 1
		// 	}
		// 	if(rev == num)
		// 	{
		// 		System.out.print(num + " ");
		// 	}
		// rev = 0;		//Intialization
	//	}	
	}
}