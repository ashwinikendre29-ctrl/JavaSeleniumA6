package NonStatic;

public class vehicle 
{
	String model;
	int year;

	public static void display(vehicle ob) 
	{
		System.out.println("Vehicle Info");
		System.out.println("Model:"+ob.model);
		System.out.println("Year:"+ob.year);
		
	}

}
