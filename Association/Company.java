class Company
{
	String name="Accenture";
	int gstno=8888;
	String Location="banglore";
	Job job;
	
	Company(Job job)
	{
		this.job=job;
	}
	void showInfo()
	{
		System.out.println("Name:"+this.name);
		System.out.println("GST num:"+this.gstno);
		System.out.println("Location:"+this.Location);
		if(this.job!=null)
		{
			System.out.println("Role:"+this.job.role);
			System.out.println("Salary:"+this.job.salary);
			System.out.println("Salary:"+this.job.type);
		}
	}
}