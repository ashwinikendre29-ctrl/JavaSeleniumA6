package NonStatic;

public class vehicleDriver 
{

	public static void main(String[] args) 
	{
		vehicle v1=new vehicle();
		v1.model="BMW";
		v1.year=2012;
		vehicle.display(v1);
		
		vehicle v2=new vehicle();
		v2.model="Honda";
		v2.year=2010;
		vehicle.display(v2);
		

	}

}
