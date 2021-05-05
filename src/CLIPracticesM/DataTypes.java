package CLIPracticesM;
class DataTypes {

static int i=4;
static final int j;		// static block
final int k;			// non-static block as well as constructor parameterised


static
{
	System.out.println("Hello.. I am static block");
	System.out.println("Value of i = " +i);
	j=10;
	System.out.println("Value of j = " +j);
	k=20;
	System.out.println("Value of k = " +k);
}	

{
	System.out.println("Hello.. I am non-static block");
	System.out.println("Value of i = " +i);
//	k=20;
	System.out.println("Value of k = " +k);
}

	 public static void main (String[] args) {
	 DataTypes d = new DataTypes();
	//	DataTypes d1 = new DataTypes();
	// 	int a = 's';
	// 	System.out.println("The value of a is " +a);

	}
}