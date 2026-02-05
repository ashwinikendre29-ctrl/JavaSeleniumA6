package NonStatic;

public class Lion 
{
    private int age;
    private String color;

Lion(int age,String color)
{
	setAge(age);
	setColor(color);
}
public int getAge()
{
	return age;
}

public Lion setAge(int age)
{
	this.age=age;
	return this;
}
public String getColor()
{
	return color;
}
public Lion setColor(String color)
{
	this.color=color;
	return this;
}
public Lion Display()
{
	System.out.println("Lion Age:"+this.age);
	System.out.println("Lion Color:"+this.color);
	return this;
}
}