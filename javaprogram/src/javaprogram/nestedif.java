package javaprogram;

public class nestedif {

	public static void main(String[] args) 
	{
		int num = 15;
		if(num%3==0 && num%5==0)
		{
			System.out.println(num + "is Divisible by both 3 and 5");
			if(num%2==0)
				System.out.println(num + "is Even");
			else
				System.out.println(num + "is Odd");
		}
		else
			System.out.println(num + "is Not Divisible by both 3 and 5");

	}

}
