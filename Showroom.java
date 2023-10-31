class Showroom
{
	String name="Honda";
	String location="Banglore";
	char type='B';
	String color="Red";
    int cost=1000;
	boolean quality=true;
	String company="Hero";
	int pincode=577518;
	
	Showroom()
	{
		
		System.out.println("showroom creatShowed");
    }
	Showroom(String name)
	{
	    this.name=name;
		System.out.println("Show room name :"+name);
	}
	Showroom(String name,String location)
	{
	    this.location=location;
		System.out.println("Show location name :"+location);
	}
	Showroom(String name,String location,char type)
	{
	    this.type=type;
		System.out.println("Show type name :"+type);
	}
	Showroom(String name,String location,char type,String color)
	{
	    this.color=color;
		System.out.println("Show color name :"+color);
	}
	Showroom(String name,String location,char type,String color,int cost)
	{
	    this.cost=cost;
		System.out.println("Show cost name :"+cost);
	}
	Showroom(String name,String location,char type,String color,int cost,boolean quality)
	{
	    this.quality=quality;
		System.out.println("Show color name :"+quality);
	}
	Showroom(String name,String location,char type,String color,int cost,boolean quality,String company)
	{
	    this.company=company;
		System.out.println("Show color name :"+company);
	}
	Showroom(String name,String location,char type,String color,int cost,boolean quality,int pincode)
	{
	    this.pincode=pincode;
		System.out.println("Show color name :"+pincode);
	}
	
}	
	
	
	
