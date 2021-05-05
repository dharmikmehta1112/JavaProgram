package CLIPractice;

public class minandmaxvalue 
{
	public static void main(String args[])
	{
		int src[]={1,4,7,2,5,8};
		int i,min=src[0],max=src[0];
		int temp=0,temp1=0;
		for(i=0;i<src.length;i++)
		{
				if(min>src[i])
						{
					         temp=src[i];
					         min=temp;
						}
				else if(max<src[i])
				{
					temp1=src[i];
					max=temp1;
				}
		}
		System.out.println("minimum value " +min);
		System.out.println("maximun Value " +max);
		
		
	}

}
