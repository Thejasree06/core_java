class Hardware{
	
	String name;
	String type;
		
	Hardware(String name,String type)
	{
		this.name=name;
		this.type=type;
	}
	
	void Show()
	{
		System.out.println("show information of Hardware");
		System.out.println("Name :"+this.name);
		System.out.println("Type :"+this.type);
		System.out.println("end information of Hardware");
		
	}
	
	
	
	
	
}