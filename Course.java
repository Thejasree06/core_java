class Course{
		
		String name;
		int year;
		String branch;
		int sem;
		int noOfClass;
		String type;
		String id;
		
		
		Course(String name,int year,String branch,int sem ,int noOfClass,String type,String id)
		{
		this.name=name;
		this.year=year;
		this.branch=branch;
		this.sem=sem;
		this.noOfClass=noOfClass;
		this.type=type;
		this.id=id;
	}
	void displayinfo()
	{
		System.out.println(" name is :"+this.name);
		System.out.println(" year is :"+this.year);
		System.out.println(" Branch is :"+this.branch);
		System.out.println(" sem is :"+this.sem);
		System.out.println(" noOfClass is :"+this.noOfClass);
		System.out.println(" type is :"+this.type);
		System.out.println("id is :"+this.id);
	}
}