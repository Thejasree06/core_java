class Person1
{
	String name;
	Email[] email;
	
	Person1()
	{
		System.out.println("Person info");
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setMail(Email[] email)
	{
		this.email=email;
	}
	void showInfo()
	{
		System.out.println("person name is:"+this.name);
		System.out.println("Email email is:"+this.email);
		if(this.email!=null)
		{
			for(int i=0; i<this.email.length; i++)
			{
				Email ref=this.email[i];
				System.out.println("Ref :"+ref);
				ref.showInfo();
			}
		}
		
	}
}