package CLIPractice;

public class AscandDes2D 
{
	public static void main(String[] args) {
		int arr[][]={{2,4,3,1,5},{6,8,7,9,10}};
		int i,j,x,y;
		int temp=0;
		for(x=0;x<arr.length;x++)
		{
			for(y=0;y<arr[x].length;y++)
			{
				
		       for(i=0;i<arr.length-1;i++)
	  	        {
			for(j=0;j<arr[i].length;j++)
			    {				
				if(arr[i][j]>arr[x][y])
				{
					temp=arr[x][y];
					arr[x][y]=arr[i][j];
					arr[i][j]=temp;
				}
				}
			}
		       for(i=1;i<arr.length;i++)
	  	        {
			for(j=0;j<arr[i].length;j++)
			    {				
				if(arr[i][j]<arr[x][y])
				{
					temp=arr[x][y];
					arr[x][y]=arr[i][j];
					arr[i][j]=temp;
				}
				}
			}
			}
		}
	   
		for(i=0;i<arr.length-1;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] +" ");
			}
		}
		System.out.println();
		for(i=1;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] +" ");
			}
		}
		
			}
			
	}


