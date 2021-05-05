package CLIPractice;

public class ascendingorder 
{
	public static void main(String args[]) 
	{
         int i,temp;
		
		int src[] = { 1, 3, 7, 8, 9, 6 };

		for (i = 0;i<src.length;i++)
		{
			
			for(int j=i+1;j<src.length;j++)
			{
			
           if(src[i]>src[j])
           {
        	   temp=src[i];
        	   src[i]=src[j];
        	   src[j]=temp;
           }
           else
           {
        	   src[i]=src[i];
           }
			}
		}
		for(i=0;i<src.length;i++)
		{
			System.out.print(src[i]+" ");
		}

	}
}
