/**
 *
 * @author dharmik mehta
 * 
 *
 */
package ExceptionDemo;
public class ClassC {
	public void m3() {
		int i=0;
		int x[] = {1, 2, 3, 4};
		try {
			for(i=0; i<=x.length; i++)
			System.out.print(x[i] + " ");	// new ArrayIndexOutOfBoundsException				
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Last index value is: " + x[i]);
		}
	}
}