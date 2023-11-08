class Restaurant
{
	String ownerName="shree";
	String[] specialItems;
	
	Restaurant()
	{
		
	}
	
	void setSpecialItems(String[] specialItems)
	{
		this.specialItems=specialItems;
	}
	void displayInfo()
	{
		System.out.println("Starting displayinfo in restaurant");
		System.out.println("ownername:"+this.ownerName);
		System.out.println("ownername:"+this.specialItems);
		if(this.specialItems!=null)
		{
			for(int i=0;i<this.specialItems.length;i++)
			{
				String specialArray=this.specialItems[i];
				System.out.println("special items:"+specialArray+"index:"+i);
				
			}
		}
	}
}	
		
		
		
		
	
	
	
	
	
