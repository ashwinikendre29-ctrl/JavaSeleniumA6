package Loops;

public class looping3 {

	public static void main(String[] args)
	{
		 int n =3;
		  
		    for(int r=1;r<=n;r++ )
		    {
		    	for(int c=1;c<=n;c++)
		    	{
		    		if(r+c<=n+1)
		    		System.out.print("*");
		    	}
		    	System.out.println();
		    	}
	}

}
