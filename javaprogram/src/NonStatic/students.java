package NonStatic;

public class students 
{

	public static int total(student  ob)
	{
		int sum=0;
		for(int i=0;i<ob.marks.length;i++)
		{
			sum=sum+ob.marks[i];
		}
		return sum;

	}
	public static double average(student ob)
	{
		int sum=total(ob);
		return sum/ob.marks.length;
	}
	public static int max(student ob)
	{
		int max=ob.marks[0];
	for(int i=1;i<ob.marks.length;i++) 
	{
		if(max<ob.marks[i])
		{
			max=ob.marks[i];
		}
	}
	return max;

}
public static int min(student ob)
{
int min=ob.marks[0];
for(int i=1;i<ob.marks.length;i++) 
{
if(min>ob.marks[i])
{
	min=ob.marks[i];
}
}
return min;

}
}
