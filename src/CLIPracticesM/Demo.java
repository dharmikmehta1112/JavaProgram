package CLIPracticesM;
public class Demo {
	public static void main(String[] args) {
		String str1 = "test";					// created in SCP and refernce to SCP
		String str2 = new String("test");		// created in Heap and a copy to SCP, but refernce to Heap
		if(str1==str2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
}