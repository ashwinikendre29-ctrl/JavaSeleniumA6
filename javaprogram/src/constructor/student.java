package constructor;

public class student 
{
       int sid;
       String sname;
       int age;
       String course;
       student(int sid,String sname,int age,String course)
       {
    	   this.sid=sid;
    	   this.sname=sname;
    	   this.age=age;
    	   this.course=course;
       }
	public static void main(String[] args) 
	{
		student s1=new student(101,"Ashwini",27,"IT");
		System.out.println("Student ID:"+s1.sid);
		System.out.println("Student Name:"+s1.sname);
		System.out.println("Age:"+s1.age);
		System.out.println("Course:"+s1.course);
		System.out.println("***********************************");
		
		student s2=new student(102,"Pooja",28,"CS");
		System.out.println("Student ID:"+s2.sid);
		System.out.println("Student Name:"+s2.sname);
		System.out.println("Age:"+s2.age);
		System.out.println("Course:"+s2.course);
		System.out.println("***********************************");
		
		student s3=new student(103,"Priya",25,"BSC");
		System.out.println("Student ID:"+s3.sid);
		System.out.println("Student Name:"+s3.sname);
		System.out.println("Age:"+s3.age);
		System.out.println("Course:"+s3.course);
		System.out.println("***********************************");
		
		


	}

}
