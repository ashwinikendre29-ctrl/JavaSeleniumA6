package NonStatic;

public class carDriver
{

	public static void main(String[] args) 
	{
		car c1= car.getRef("BMW",12344);
		c1.display(c1);
		car c2=car.getRef("Audi", 43456);
		c2.display(c2);

	}

}
