package NonStatic;

public class FoodDriver
{

	public static void main(String[] args)
	{
		FoodDish f1=FoodDish.getRef();
		f1.display();
		String[] str= {"fwsf","fqf","udywo"};
		FoodDish f2=FoodDish.getRef("Pani puri","Chat");
		System.out.println(f2.display().setDishName("Honey Chilli Potato").display().setCategory("Starter").display().addIngred("Honey","Chilli","Potato","oil").display().getCategory());

	}

}
