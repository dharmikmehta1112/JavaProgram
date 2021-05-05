package ArrayDemo;

public class EvenElement
{
	public static void main(String[] args)
	{
		int[] x = {5, 10, 15, 30, 80, 145};
		for (int i=0; i<x.length; i++)
		{
			if(x[i]%2==0)
				System.out.println(x[i]);
		}
	}
}