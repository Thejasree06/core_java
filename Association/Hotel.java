class Hotel
{
	String name;
	String ownerName;
	MenuCard menucard;
	
	void setMethod1(MenuCard menucard)
	{
		this.menucard=menucard;
	}
	void showInfo()
	{
		System.out.println("name:"+this.name);
		System.out.println("ownername:"+this.ownerName);
		System.out.println("MenuCard:"+this.menucard);
		if(this.menucard!=null)
		{
			System.out.println("Total items:"+this.menucard.cost);
		}
		
	}
}
