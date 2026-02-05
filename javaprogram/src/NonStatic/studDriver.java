package NonStatic;

import java.util.Scanner;


public class studDriver 
{

	public static void main(String[] args) 
	{

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Student Id:");
      int id=sc.nextInt();
      System.out.println("Enter Student Name:");
      String name=sc.next();
      System.out.println("Enter Student Age:");
      int age=sc.nextInt();
      System.out.println("Enter total no. of marks:");
      int size=sc.nextInt();
      int []marks=new int[size];
      System.out.println("Enter marks for each subject:");
      for(int i=0;i<size;i++)
      {
    	  marks[i]=sc.nextInt();
    	  
      }
      
              student s1 = new student(id,name,age,marks);
    		  System.out.println("Total Marks:"+students.total(s1));
              System.out.println("Average:"+students.average(s1));
              System.out.println("Maximum marks:"+students.max(s1));
              System.out.println("Minimum marks:"+students.min(s1));
              
              
              
            
              
      
      
      
      
      
	}

}
