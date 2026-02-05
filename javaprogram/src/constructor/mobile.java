package constructor;

public class mobile
{
	String brand;
	String color;
	int Ram;
	double price;
	mobile()
	{
		System.out.println("Congrats for Mobile");
		
	}
	mobile(String brand)
	{
		this();
		this.brand=brand;
		System.out.println("Initializing Brand");
	}
	mobile(String brand,String color)
	{
		this(brand);
		this.color=color;
		System.out.println("Initializing Color");
	}
	mobile(String brand,String color,int Ram)
	{
		this(brand,color);
		this.Ram=Ram;
		System.out.println("Initializing Ram");
	}
	mobile(String brand,String color,String Ram,double price)
	{
		this(Ram);
		this.price=price;
		System.out.println("Initializing price");
	}

	public static void main(String[] args) 
	{
		mobile m1=new mobile("VIVO","Black","8GB",15000);
		

	}

}
