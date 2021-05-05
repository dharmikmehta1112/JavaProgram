package CLIPractice;

public class sortbyindex {
	public static void main(String arg[]) {

		int[] a = { 4, 3, 8, 2, 1,0 };

		int b=0;
		int des[]=new int[6];
		for (int i = 0; i < a.length; i++)
		{
			for(int j=0;j<a.length;j++)
			{
			  if(i == a[j])
			  {
				  b=a[j];
				  des[b]=b;
				  //break;
			  }
			}
			  if(i != a[i])
			  {
				  //System.out.println("ArrayIndexOutOfBoundException");
			  }
			  
		}
		for(b=0;b<des.length;b++)
		{
		
    System.out.print(des[b] +" ");
		}
	}
}


