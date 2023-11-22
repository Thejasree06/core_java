class Vegitbles extends FoodItem
{
	String Color;
	double size;
	
	Vegitbles(String Color,double size,String name,String veg,String nonVeg,boolean quality,int cost,double heat,int no,String items,String sweets,double weight)
	{
		super(name,veg,nonVeg,quality,cost,heat,no,items,sweets,weight);
		this.name=name;
		this.cost=cost;
	}
	void cutting()
	{
		System.out.println("Starting no arh in cutting");
	}
	void clean()
	{
		System.out.println("Starting no arh in clean");
	}
	void boil()
	{
		System.out.println("Starting no arh in boil");
	}
	void roast()
	{
		System.out.println("Starting no arh in roast");
	}
	@Override
	void cold()
	{
		System.out.println("Starting no arg in cold");
	}
	void oil()
	{
		System.out.println("Starting no arg in oil");
	}
	void packing()
	{
		System.out.println("Starting no arg in packing");
	}
	void mixing()
	{
		System.out.println("Starting no arg in mixing");
	}
	

	
	
	
	
	
	
}