package CLIPractices;
class VariableTypes
{
	int x =10;		// Instance variable
	static int z = 30;	// Static Variable

	{
		System.out.println("Instance Variable: " + x);
		System.out.println("Static Variable: " + z);
	}

	public static void main (String[] args)
	{
		int y = 20;	// Local Variable
		VariableTypes p = new VariableTypes();
		System.out.println("Instance Variable: " + p.x);
		System.out.println("Local Variable: " + y);
		System.out.println("Static Variable: " + z);

		// int i = 1, n, rem = 0, rev = 0;
		// System.out.print("Palindrome number from 1 to 100: ");
		// while(i<=100)
		// {
		// 	n = i;		// loop indicator
		// 	while(n>0)
		// 	{
		// 		rem = n % 10;
		// 		rev = rev * 10 + rem;
		// 		n = n / 10;
		// 	}
		// 	if(rev == i)
		// 	{
		// 		System.out.print(i + " ");
		// 	}	
		// rev=0;
		// i++;
		// }
	}
}