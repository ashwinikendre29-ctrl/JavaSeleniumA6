package Relation;

public class CarDriver1 
{

	public static void main(String[] args)
	{
		Car1 c1=new Car1("Audi",86787,"Black");
		System.out.println("Car Info:");
		System.out.println("Brand:"+c1.brand+"Price:"+c1.price+"Color:"+c1.color);
		
		
		c1.t1[0]=new Tyres("Run Flat",21);
		c1.t1[1]=new Tyres("Run Flat",21);
		c1.t1[2]=new Tyres("Run Flat",21);
		c1.t1[3]=new Tyres("Run Flat",21);
		
		System.out.println("Tyres Info:");
		for(int i=0;i<c1.t1.length;i++)
		{
			System.out.println("Tyres Type:"+c1.t1[i].type+"Tyres size:"+c1.t1[i].size);
		}

	}

}
