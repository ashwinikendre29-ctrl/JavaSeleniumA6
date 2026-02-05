package Relation;

public class Student extends Person
{
     int id;
     double marks=84.3;
     public  void display()
     {
    	 System.out.println(name);
    	 System.out.println(age);
    	 walk();
    	 
    	 System.out.println(id);
    	 System.out.println(marks);
    	 System.out.println(planet);
     }
	public static void main(String[] args) 
	{
		
       Student s1= new Student();
       System.out.println(s1.id);
       System.out.println(s1.marks);
       
       System.out.println(s1.name);
       System.out.println(s1.age);
       s1.walk();
       System.out.println(s1.planet);
       
       System.out.println("**************************");
       s1.display();
	}

}
