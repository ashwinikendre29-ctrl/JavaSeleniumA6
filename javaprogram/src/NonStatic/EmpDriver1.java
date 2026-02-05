package NonStatic;

public class EmpDriver1 
{

	public static void main(String[] args)
	{
		Employee1 e1= Employee1.getRef(101,"Pooja", 8308548);
		Employee1.display(e1);
		Employee1 e2= Employee1.getRef(102,"Shruti", 869854);
		Employee1.display(e2);
		Employee1 e3= Employee1.getRef(101,"Priy",997098);
		Employee1.display(e3);
		
		

	}

}
