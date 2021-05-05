package InterviewQuestions;

public class MOverridingQ1Run extends MOverridingQ1		// class B extends A
{
		public void m1()
		{
			System.out.println("hi");
		}
		
	public static void main(String[] args)
	{
		MOverridingQ1 a = new MOverridingQ1Run();							// A a = new B();
		a.m1();
		MOverridingQ1 b = (MOverridingQ1Run) new MOverridingQ1Run();		// A a = (B) new B();
		b.m1();
		MOverridingQ1Run c = (MOverridingQ1Run) new MOverridingQ1();
		c.m1();
		
	}

}