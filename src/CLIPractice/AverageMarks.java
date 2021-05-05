package CLIPractice;

public class AverageMarks 
{
public static void main(String[] args) {
	int i,sum=0;
	int marks[]={80,86,85,81,82,83,84,88,87,90};
	float average;
	for(i=0;i<marks.length;i++)
	{
		sum=sum+marks[i];
		
	}
	
	System.out.println("Total sum of marks "+sum);
	average = sum/marks.length;
	System.out.print("Average of Marks "+average);
}
}
