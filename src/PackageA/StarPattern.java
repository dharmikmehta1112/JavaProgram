/*
Star Pattern: 
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
*/

package PackageA;

public class StarPattern {
	
	public void StarP(int rows) {
		for(int i=0; i<rows; i++){
			for(int j=rows-1; j>i; j--) {
				System.out.print(" ");
			} for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}System.out.println();
		}
	}
	public static void main(String[] args) {
		StarPattern a = new StarPattern();
		System.out.println("Star Pattern: ");
		a.StarP(5);
	}
}