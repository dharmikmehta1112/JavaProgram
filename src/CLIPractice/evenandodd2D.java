package CLIPractice;

public class evenandodd2D {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };
		int i, j;
		//int arr1[][]=new int[2][10];
		int  temp = 0;
		int temp1=0;
		
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++)
			{
				if (arr[i][j] % 2 == 0) 
				{
					arr[i][j] = arr[i][j];
					
				} 
				else if(arr[i][j]%2 != 0)
					temp=arr[i][j];
				if(arr[1][j]%2 != 0)
				 arr[1][j]=arr[1][j];
				else
				{
					temp1=arr[1][j];
					arr[1][j]=temp;
					arr[i][j]=temp1;
				}
			}
			
				}
				/*else 
				{
					temp=arr[i][j];
					for(i=1;i<arr.length;i++){
						for(k=0;k<arr[i].length;k++)
						{
							if(arr[i][k]%2 != 0)
							{
								arr[i][k]=arr[i][k];
							}
							else
							{
							    temp1=arr[i][k];
								arr[i][k]=temp;
								arr[i][j]=temp1;
						}
						
						}
					}
					
				}*/
        	
              for(i=0;i<arr.length-1;i++)
              {
            	  for(j=0;j<arr[i].length;j++)
            	  {
      				System.out.print(" " + arr[i][j] + " ");

            	  }                        	 
              }
             System.out.println();
              
              for(i=1;i<arr.length;i++)
              {
            	  for(j=0;j<arr[i].length;j++)
            	  {
      				System.out.print(" " + arr[i][j] + " ");

            	  }                        	 
              }

			}
		
	}



	

