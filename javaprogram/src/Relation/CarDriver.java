package Relation;

public class CarDriver 
{

	public static void main(String[] args)
	{
		Car c1=new Car("Audi",86787,"Black");
		System.out.println("Car Info:");
		System.out.println("Brand:"+c1.brand+"Price:"+c1.getPrice()+"Color:"+c1.color);
		System.out.println("Engine Info:");
		System.out.println("Engine Type:"+c1.getE().engineType+"CC:"+c1.getE().cc+"HP:"+c1.getE().hp);

	}

}
