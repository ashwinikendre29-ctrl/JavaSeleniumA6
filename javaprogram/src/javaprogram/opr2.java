package javaprogram;

public class opr2 {

	public static void main(String[] args)
	{
		int age = 34;
		String day = "Sunday";
		//boolean isweekend =true;
		if (age <=13)
		{
			if (day=="Saturday" || day=="Sunday")
				System.out.println("Pay 120Rs. price for ticket");
			else
				System.out.println("Pay 100Rs. price for ticket");
		}
		else if(age >=14 && age <=64)
		{
			if (day=="Saturday" || day=="Sunday")
				System.out.println("Pay 150Rs. price for ticket");
			else
				System.out.println("Pay 180Rs. price for ticket");
		}

		else
		{
			if (day=="Saturday" || day=="Sunday")
				System.out.println("Pay 130Rs. price for ticket");
			else
				System.out.println("Pay 150Rs. price for ticket");


				

		}

	}
 
}
