package Loops;

public class Evendigit {

	public static void main(String[] args)
	{
		System.out.println(test(543268));

	}
	public static int test(int n)
	{
		int count=0;
		while(n>0)
		{
			int rem =n/10;
			if(rem%2==0)
				count++;
			n=n/10;
		}
		return count;
	}

}
