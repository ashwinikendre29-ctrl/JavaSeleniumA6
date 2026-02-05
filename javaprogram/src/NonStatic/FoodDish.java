package NonStatic;


import java.util.Arrays;

public class FoodDish 
{
    private String dishname;
    private String category;
    private String[] ingred;
    private FoodDish()
    {
    	
    }
    private FoodDish(String dishname,String category)
    {
    	setDishName(dishname);
    	setCategory(category);
    }
    public static FoodDish getRef()
    {
    	return new FoodDish();
    }
    public static FoodDish getRef(String dName,String cate)
    {
    	return new FoodDish(dName,cate);
    }
    public String getDishName()
    {
    	return dishname;
    	
    }
    public String getCategory()
    {
    	return category;
    }
    public String[] getIngred()
    {
    	return ingred;
    }
    public FoodDish setDishName(String dishname)
    {
    	this.dishname=dishname;
    	return this;
    }
    public FoodDish setCategory(String category)
    {
    	this.category=category;
    	return this;
    }
    public FoodDish addIngred(String...ingred)
    {
    	this.ingred=ingred;
    	return this;
    }
    public FoodDish display()
    {
    	System.out.println("Dish Name:"+this.dishname);
    	System.out.println("Category:"+this.category);
    	System.out.println("Ingredients:"+Arrays.toString(this.ingred));
    	return this;
    }
}
