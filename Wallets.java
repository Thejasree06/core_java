class Wallets
{
	String brand="brand";
	double cost=500;
	String color="red";
	int no=102;
	
	Wallets()
	{
		super();
	}
	Wallets (String brand)
	{
		super();
		this.brand=brand;
		System.out.println("Wallet brand is:"+brand);
	}
	Wallets (String brand,double cost)
	{
		super();
		this.brand=brand;
		this.cost=cost;
		System.out.println("Wallet cost is:"+cost);
	}
	Wallets(String brand,double cost,String color)
	{
		super();
		this.brand=brand;
		this.cost=cost;
		this.color=color;
		System.out.println("Wallet color is:"+color);
	}
	Wallets(String brand,double cost,String color,int no)
	{
		super();
		this.brand=brand;
		this.cost=cost;
		this.color=color;
		this.no=no;
		System.out.println("Wallet no is:"+no);
	}
	
}