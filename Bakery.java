class Bakery 
{ 

 static	String name;
 static	String[] biscuits;
 static long[] contactNos;
 static	String[] machines;
 static	boolean locked;
 static	String[] cakes;
 static String[] chocolates;
	
	static void displayInfo()
	{
		System.out.println("display the information of displayinfo");
		System.out.println("name "+name);
		
		for(int index=0; index<biscuits.length;index++)
		{
			String ref=biscuits[index];
			System.out.println("name is :"+""+index+""+" is "+ref);
		}
		for(int index=0; index<contactNos.length; index++)
		{
			long ref=contactNos[index];
			System.out.println("contact no is :" + "" +index+" "+" is "+ref);
		}
		for(int index=0; index<machines.length; index++)
		{
			String ref=machines[index];
			System.out.println("machines name is :" + "" +index+" "+" is "+ref);
		}
		
		for(int index=0; index<cakes.length; index++)
		{
			String ref=cakes[index];
			System.out.println("cakes name is :" + "" +index+" "+" is "+ref);
		}
		for(int index=0; index<chocolates.length; index++)
		{
			String ref=chocolates[index];
			System.out.println("chocolate name  is :" + "" +index+" "+" is "+ref);
		}
		System.out.println("locked "+locked);
		
		
		
		
	}
	static void setName(String name)
	{
		Bakery.name=name;
	}
	static void setBiscuits(String[] biscuits)
	{
		Bakery.biscuits=biscuits;
	}
	static void setContactNos(long[] contactNos)
	{
		Bakery.contactNos=contactNos;
	}
	static void setMachines(String[] machines)
	{
		Bakery.machines=machines;
	}
	static void setLocked(boolean locked)
	{
		Bakery.locked=locked;
	}
   static void setCakes(String[] cakes)
   {
	   Bakery.cakes=cakes;
   }
   static void setChocolates(String[] chocolates)
   {
	   Bakery.chocolates=chocolates;
   }
}