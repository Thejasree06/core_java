class KeyBoard
{
	String brand="Dell";
	String color="Red";
	double noOfKeys=10;
	char type='A';
	int cost=2000;
	
	KeyBoard()
	{
		System.out.println("Keyboard created");
	}
	
	KeyBoard(String brand)
	{
		this.brand=brand;
		System.out.println("keyboard brand is :"+brand);
	}
	KeyBoard(String brand,String color)
	{
		this.color=color;
		System.out.println("keyboard color is :"+color);
	}
	KeyBoard(String brand,String color,double noOfKeys)
	{
		this.noOfKeys=noOfKeys;
		System.out.println("KeyBoard noOfkeys :"+noOfKeys);
	}
	KeyBoard(String brand,String color,double noOfKeys,char type)
	{
		this.type=type;
		System.out.println("keyboard type:"+type);
	}
	KeyBoard(String brand,String color,double noOfKeys,char type,int cost)
	{
		this.cost=cost;
		System.out.println("Keyboard cost is:"+cost);
	}

	
	
}
