package NonStatic;

import java.util.Scanner;

public class RATDriver
{

	public static void main(String[] args) 
	{
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter the height of RAT");
       int height=sc.nextInt();
       System.out.println("Enter the base of RAT");
       int base=sc.nextInt();
       
       RAT r1=new RAT(base,height);
       System.out.println("Area:"+RATs.calArea(r1));
       System.out.println("Hypotenuse:"+RATs.calHypo(r1));
       System.out.println("Perimeter:"+RATs.calPerimeter(r1));

	}

}
