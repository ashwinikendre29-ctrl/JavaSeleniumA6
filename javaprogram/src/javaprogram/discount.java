package javaprogram;

public class discount {

	public static void main(String[] args) 
	{
		String category ="Clothing"	;
		double amount =1000;
		if(category=="Eletronic")
		{
			if(amount >5000)
				System.out.println("won Discount 20% on purchase");
			else
				System.out.println("Discount of 15% on purchase"); 
		}
		else if (category=="Food")
		{
			if(amount >1000)
				System.out.println("Won 5% discount on purchase");
			else
				System.out.println("No discount : (better luck next time");
		}
		else
			System.out.println("10% discount on purchase");
		}
		}


