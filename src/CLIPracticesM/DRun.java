package CLIPracticesM;
public class DRun {
	
	public static void main(String[] args) {
	D d = new D();
	int result = d.add(10,20);
	System.out.println("Result: "+result);
//	System.out.println("Result: "+d);		//print as {Result: D@1761e840} --> className@hashCode --> This is not a memory. This is object hashcode
	}
}