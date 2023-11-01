class MakeupKit
{
	String brand="Lakme";
	String item="Bigkit";
	double cost=1000;
	int no=101;
	
	MakeupKit()
	{
		super();
	}
	MakeupKit(String brand)
	{
		super();
		this.brand=brand;
		System.out.println("Makeup brand is:"+brand);
	}
	MakeupKit(String brand,String item)
	{
		super();
		this.brand=brand;
		this.item=item;
		System.out.println("Makeup item is:"+item);
	}
	MakeupKit(String brand,String item,double cost)
	{
		super();
		this.brand=brand;
		this.item=item;
		this.cost=cost;
		System.out.println("Makeup cost is:"+cost);
	}
	MakeupKit(String brand,String item,double cost,int no)
	{
		super();
		this.brand=brand;
		this.item=item;
		this.cost=cost;
		this.no=no;
		System.out.println("Makeup no is:"+no);
	}
}