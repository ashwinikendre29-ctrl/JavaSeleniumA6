package NonStatic;

public class LionDriver
{

	public static void main(String[] args) 
	{
		Lion L1=new Lion(10,"Brown");
		System.out.println(L1.Display().setAge(12).Display().setColor("White").Display().getColor());

	}

}
