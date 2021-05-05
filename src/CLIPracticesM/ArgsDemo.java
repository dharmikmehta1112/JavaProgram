package CLIPracticesM;
class ArgsDemo {
	public static void main (String[] a){
		int len = a.length;
		System.out.println("Length of args: " +len);
		for (int i=0; i<len; i++ ) {
			System.out.println("Array values at "+i+" position: " +a[i]);			
		}
	}
}