package Relation;

public class SamChild1 extends Sample1 
{
	char ch='%';
	static String str="XYZ";

	public static void main(String[] args) 
	{
		Sample1 sp=new Sample1();
		System.out.println(sp.size);
		System.out.println(sp.b);
		//System.out.println(sp.ch);
		//System.out.println(sp.str);
		
		
		System.out.println("*****************");
		SamChild1 sc= new SamChild1();
		System.out.println(sc.ch);
		System.out.println(sc.str);
		System.out.println(sc.size);
		System.out.println(sc.b);
		

	}

}
