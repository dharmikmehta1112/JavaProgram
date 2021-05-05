package AllPatterns;
/*
1 1 1 1 1 1 1
1 1 1 1 1 2 2
1 1 1 1 3 3 3
1 1 1 4 4 4 4
1 1 5 5 5 5 5
1 6 6 6 6 6 6
7 7 7 7 7 7 7
*/

public class PatternNumber16
{
  public static void main(String[] args)
  {
    for(int i=1; i<=7; i++)
    {
      for(int j=6; j>=i; j--)
      {
        System.out.print("1 ");
      }
      for(int k=1; k<=i; k++)
      {
        System.out.print(i + " ");
      }
    System.out.println();
    }
  }
}