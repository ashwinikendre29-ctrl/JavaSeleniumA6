package constructor;

public class Example
{
	static String institute ="Qspider";
	public Example()

	{
		System.out.println("Qspider Constructor");
	}
	static
	{
		System.out.println("Welcome to"+institute);
	}
	String course;
	Example(String course,String type)
	{
		this.course =course;
		this.type =type;
	}
	public void attend()
	{
		System.out.println("Student attending class");
	}
	{
		System.out.println(":Hello student :");
	}
	String type="QSP";
	public static void day()
	{
		System.out.println("Today os Monday");
	}
	public static void main(String[] args)
	{
		Example obj=new Example();
		System.out.println("Institute:"+Example.institute);
		System.out.println("Course:"+obj.course);
		System.out.println("Type:"+obj.type);
		day();
		obj.attend();
		
		
	    Example ob=new Example();
	    System.out.println("Institute:"+Example.institute);
		System.out.println("Course:"+ob.course);
		System.out.println("Type:"+ob.type);
		day();
		ob.attend();
		
	    

	}

}
