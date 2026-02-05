package Loops;

public class Digit {

	public static void main(String[] args)
	{
		
		System.out.println(count (1234));
		int res = count (23101);
		
	}
	public static int count(int n)
	{
		int count = 0;
		while(n>0)
		{
		n=n/10;
		count++;
		}
		return count;
		

	}

}
