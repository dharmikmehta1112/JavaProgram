package ExceptionDemo;

/**
 * @author Dharmik Mehta
 */
public class ArgsExceptionDemo {
	
		public static void main(String args[]) {
			
		try{
			int a = args.length;
			int b = 10/a;
			System.out.println(a);
			try{
				if(a==1){
					a=a/a-a;
				}
				if(a==2){
					int c = {1};	// Error assigning array value
					c[8] = 9;
				}
			}	// Inner try not having catch() / Finally() block
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Type A");
		}
		catch(ArithmeticException e){
			System.out.println("Type B");	
		}
		}
	}
}
