class Ornament
{
	String type="Gold";
	String color="yellow";
	char size='s';
	int no=111;
	
	Ornament()
	{
		super();
	}
	Ornament(String type)
	{
		super();
		this.type=type;
		System.out.println("ornament type is:"+type);
	}
	Ornament(String type,String color)
	{
		super();
		this.type=type;
		this.color=color;
		System.out.println("ornament type is:"+color);
	}
	Ornament(String type,String color,char size)
	{
		super();
		this.type=type;
		this.color=color;
		this.size=size;
		System.out.println("ornament size is:"+size);
	}
	Ornament(String type,String color,char size,int no)
	{
		super();
		this.type=type;
		this.color=color;
		this.size=size;
		this.no=no;
		System.out.println("ornament no is:"+no);
	}
	
}