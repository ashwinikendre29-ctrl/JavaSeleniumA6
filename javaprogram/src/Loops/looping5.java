package Loops;

public class looping5 {

	public static void main(String[] args)
	{
		int n=4;
		for(int i=1;i<=n;i++)
		{
			
			   int ch = 65; 
	            for (int j = 1; j <= i; j++)  
	            { 
	                System.out.print(((char)ch)); 
	                ch++;
	                System.out.print(" ");
	                
			}
			System.out.println();
		}
		

	}

}
