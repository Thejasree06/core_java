class Brand{
	
	String name="HP";
	String origin="Banglore";
	String ceoName="Shree";
	String[] cities;
	
	Brand()
	{
	}
	
	Brand(String[] cities) //  declare variable using constructor 
	{
		this.cities=cities;
		
	}
	
	void show()
	{
		System.out.println("show information of Brand");
		System.out.println("name :"+this.name);
		System.out.println("origin :"+this.origin);
		System.out.println("ceoName:"+this.ceoName);
		System.out.println("cities :"+this.cities);
		if(cities!=null)
		{
		for(int seq=0;seq<this.cities.length; seq++)
		{
           String ref=this.cities[seq];
		   System.out.println("brand of :"+ref+ " of " +seq);
			
		}
		
	}
	System.out.println("end information of Brand");
	}	
} 