package CLIPractice;

public class reversearray 
{
	public static void main(String arg[])
	{
	int src[]={1,2,3,4,5,6};
	
	int des[]=new int[6];
	
	int i,k=src.length-1;
	
		for(i=0;i<src.length;i++)
		{
			des[k]=src[i];
			k--;
			}
		for(k=0;k<des.length;k++)
		{
			System.out.print(des[k]+" ");
				
		}
		}

	}
	
	
	


