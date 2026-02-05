package NonStatic;

public class RATs
{

	public static double calArea(RAT ob)
	{
		return( 0.5*ob.height*ob.base);

	}
	public static double calHypo(RAT ob)
	{
		double hypo=(ob.height*ob.height)+(ob.base*ob.base);
		return Math.sqrt(hypo);
	}
	public static double calPerimeter(RAT ob)
	{
		double hypo=calHypo(ob);
		return (ob.height+ob.base+hypo);
	}

}
