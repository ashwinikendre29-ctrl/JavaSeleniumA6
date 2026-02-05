package NonStatic;

public class Demo 
{

	public Demo m1()
	{
		System.out.println("M1()");
		return this;

	}
	public Demo m2()
	{
		System.out.println("M2()");
		return this;
	}
	public void m3()
	{
		System.out.println("M3()");
	}

}
