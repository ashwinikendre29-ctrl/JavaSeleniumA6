package NonStatic;

public class Employee1 
{
	int id;
	String name;
	long phone;
	
	private Employee1(int id,String name,long phone)
	{
		this.id=id;
		this.name=name;
		this.phone=phone;
	}

	public static Employee1 getRef(int id,String name,long phone)
	{
		
        return new Employee1(id,name,phone);
	}
	public static void display(Employee1 e)
	{
		System.out.println("ID:"+e.id);
		System.out.println("Name:"+e.name);
		System.out.println("Phone:"+e.phone);
	}

}
