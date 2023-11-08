class Canteen
{
	String type;
	String[] utensils;
	
	void setType(String type)
	{
		this.type=type;
	}
	void setUtensils(String[] utensils)
	{
		this.utensils=utensils;
	}
	void showInfo()
	{
		System.out.println("Type:"+this.type);
		System.out.println("Utensils:"+this.utensils);
		if(this.utensils!=null)
		{
			for(int i=0;i<this.utensils.length;i++)
			{
				String ref=this.utensils[i];
				System.out.println("Utensils:"+ref+"index:"+i);
				
			}
		}
		
	}
}