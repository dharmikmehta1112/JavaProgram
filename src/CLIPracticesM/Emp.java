package CLIPracticesM;
public class Emp {
	public String empName;
	public int age;

	public Emp(String _empName, int _age) {
		this.empName=_empName;
		this.age=_age;
	}

//	protected void printEmp() {
	public void printEmp() {
		System.out.println("Emp Name="+empName+"\n"+ "Emp Age="+age);
	}
}