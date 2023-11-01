class RocketStart
{
	public static void main(String[] arg)
	{
		Rocket rocket=new Rocket("Adithya");
		System.out.println("name:"+rocket.name);
		
		Rocket rocket1=new Rocket("Adithya",2526);
		System.out.println("name:"+rocket1.name);
		System.out.println("id:"+rocket1.id);
		
		Rocket rocket2=new Rocket("Adithya",2526,20);
		System.out.println("name:"+rocket2.name);
		System.out.println("id:"+rocket2.id);
		System.out.println("length:"+rocket2.length);
		
		Rocket rocket3=new Rocket("Adithya",2526,20,1000);
		System.out.println("name:"+rocket3.name);
		System.out.println("id:"+rocket3.id);
		System.out.println("length:"+rocket3.length);
		System.out.println("speed:"+rocket3.speed);
		
		Rocket rocket4=new Rocket("Adithya",2526,20,1000,"Adii");
		System.out.println("name:"+rocket4.name);
		System.out.println("id:"+rocket4.id);
		System.out.println("length:"+rocket4.length);
		System.out.println("speed:"+rocket4.speed);
		System.out.println("engine:"+rocket4.engine);
		
		
		
		
		
		
		
	}
}