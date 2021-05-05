package CLIPractice;

public class simplearray {
	public static void main(String[] args) {
		int arr[]={4,6,8,5};
		int arr1[]=new int[4];
		int k;
		
		int a[]={4,6,5,9,7};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int j=0;j<arr.length;j++)
		{
			for( k=0;k<arr1.length;k++)
			{
				arr1[k]=arr[j];
				
			}
		}
		
		for(k=0;k<arr1.length;k++)
		{
			System.out.print(arr1[k]+" ");
		}
	}

}
