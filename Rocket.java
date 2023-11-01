class Rocket
{
	String name="Adithya";
	int id=2526;
	double length=20;
	long speed=1000;
	String engine="Adii";
	
	Rocket()
	{
		super();
	}
	Rocket(String name)
	{
		super();
		this.name=name;
		System.out.println("Rocket name is:"+name);
	}
	Rocket(String name,int id)
	{
		super();
		this.name=name;
		this.id=id;
		System.out.println("Rocket id is:"+id);
	}
	Rocket(String name,int id,double length)
	{
		super();
		this.name=name;
		this.id=id;
		this.length=length;
		System.out.println("Rocket length is:"+length);
	}
	Rocket(String name,int id,double length,long speed)
	{
		super();
		this.name=name;
		this.id=id;
		this.length=length;
		System.out.println("Rocket speed is:"+speed);
	}
	Rocket(String name,int id,double length,long speed,String engine)
	{
		super();
		this.name=name;
		this.id=id;
		this.length=length;
		this.engine=engine;
		System.out.println("Rocket engine is:"+engine);
	}
	
}