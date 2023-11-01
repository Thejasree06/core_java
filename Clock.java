class Clock
{
	int no=12;
	double cost=50;
	String brand="wall";
	String color="Red";
	
	Clock()
	{
		super();
	}
	Clock(int no)
	{
	 super();
     this.no=no;
     System.out.println("Clock no is:"+no);	 
	}
	Clock(int no,double cost)
	{
		super();
		this.cost=cost;
		System.out.println("Clock cost is:"+cost);
	}
	Clock(int no,double cost,String brand)
	{
		super();
		this.brand=brand;
		System.out.println("Clock brand is:"+brand);
	}
	Clock(int no,double cost,String brand,String color)
	{
		super();
		this.color=color;
		System.out.println("Clock color is:"+color);
	}
}