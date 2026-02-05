package NonStatic;

public class EmpDriver 
{

	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		e1.id=121;
		e1.name="Amey";
		e1.salary=123;
		Employee.display(e1);
		
		Employee e2=new Employee();
		e2.id=11;
		e2.name="Rohan";
		e2.salary=4523;
		Employee.display(e2);
	}

}
