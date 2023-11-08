class Email
{
	String domain;
	int id;
	String fname;
	String lname;
	
	
	Email()
	{
		
	}
	
	Email(String domain,int id,String fname,String lname)
	{
		System.out.println("Starting mail in email");
		this.domain=domain;
		this.id=id;
		this.fname=fname;
		this.lname=lname;
		System.out.println("Ending mail in email");
		
	}
	void showInfo()
	{
		System.out.println("email domain:"+this.domain);
		System.out.println("email id:"+this.id);
		System.out.println("email fname:"+this.fname);
		System.out.println("email lname:"+this.lname);
		
	}
}