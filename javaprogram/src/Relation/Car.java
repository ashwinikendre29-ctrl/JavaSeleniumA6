package Relation;

public class Car
{
	String brand;
	double price;
	String color;
	Car(String brand,double price,String color)
	{
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	private Engine e = new Engine("SS",809,1600);
	public double getPrice()
	{
		return price;
	}
	public Engine getE()
	{
		return e;
	}
	public void setE(Engine e)
	{
		this.e=e;
	}

}
