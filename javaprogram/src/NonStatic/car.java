package NonStatic;

public class car

{

	  String brand;
	  double price;
	  private car(String brand,double price)
	  {
		  this.brand=brand;
		  this.price=price;
	  }
	  

		public static car getRef(String brand,double price)
		{
			return new car(brand,price);
	     
		}
       public static void display(car c)
       {
    	   System.out.println("Car Brand:"+c.brand+"Car Price:"+c.price);
       }
}
