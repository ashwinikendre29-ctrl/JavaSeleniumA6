package NonStatic;

public class Employee 
{
	int id;
	String name;
	double salary;

	public static void display(Employee ob)
	{
		System.out.println("Employee Info");
		System.out.println("ID:"+ob.id);
		System.out.println("Name:"+ob.name);
		System.out.println("Salary:"+ob.salary);

	}

}
