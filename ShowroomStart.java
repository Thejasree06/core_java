class ShowroomStart
{
	public static void main(String[] args)
	{
		Showroom showroom=new Showroom();
		
		System.out.println("String name :"+showroom.name);
		System.out.println("String location :"+showroom.location);
		System.out.println("String type :"+showroom.type);
		System.out.println("String color :"+showroom.color);
		System.out.println("String cost :"+showroom.cost);
		System.out.println("String name :"+showroom.name);
		System.out.println("String quality :"+showroom.quality);
		System.out.println("String company :"+showroom.company);
		System.out.println("String pincode :"+showroom.pincode);
		
		Showroom showroom1=new Showroom("Honda");
		
		System.out.println("String name :"+showroom1.name);
		System.out.println("String location :"+showroom1.location);
		System.out.println("String type :"+showroom1.type);
		System.out.println("String color :"+showroom1.color);
		System.out.println("String cost :"+showroom1.cost);
		System.out.println("String name :"+showroom1.name);
		System.out.println("String quality :"+showroom1.quality);
		System.out.println("String company :"+showroom1.company);
		System.out.println("String pincode :"+showroom1.pincode);
		
		Showroom showroom2=new Showroom("Honda","Banglore");
		
		System.out.println("String name :"+showroom2.name);
		System.out.println("String location :"+showroom2.location);
		System.out.println("String type :"+showroom2.type);
		System.out.println("String color :"+showroom2.color);
		System.out.println("String cost :"+showroom2.cost);
		System.out.println("String name :"+showroom2.name);
		System.out.println("String quality :"+showroom2.quality);
		System.out.println("String company :"+showroom2.company);
		System.out.println("String pincode :"+showroom2.pincode);
		
		Showroom showroom3=new Showroom("Honda","Banglore",'B');
		
		System.out.println("String name :"+showroom3.name);
		System.out.println("String location :"+showroom3.location);
		System.out.println("String type :"+showroom3.type);
		System.out.println("String color :"+showroom3.color);
		System.out.println("String cost :"+showroom3.cost);
		System.out.println("String name :"+showroom3.name);
		System.out.println("String quality :"+showroom3.quality);
		System.out.println("String company :"+showroom3.company);
		System.out.println("String pincode :"+showroom3.pincode);
		
		Showroom showroom4=new Showroom("Honda","Banglore",'B',"Red",1000,true,"Hero",577518);
		
		System.out.println("String name :"+showroom4.name);
		System.out.println("String location :"+showroom4.location);
		System.out.println("String type :"+showroom4.type);
		System.out.println("String color :"+showroom4.color);
		System.out.println("String cost :"+showroom4.cost);
		System.out.println("String name :"+showroom4.name);
		System.out.println("String quality :"+showroom4.quality);
		System.out.println("String company :"+showroom4.company);
		System.out.println("String pincode :"+showroom4.pincode);
		
	}
}
