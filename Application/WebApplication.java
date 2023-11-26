class WebApplication extends Application{
	
	String[] supportedBrowsers;
	boolean free;
	
	WebApplication()
	{
	System.out.println("running no-arg const of WebApplication");
	}
	WebApplication(int id,String name,ApplicationType type,String version,String developer,String date)
	{
		super(id,name,type,version,developer,date);
	System.out.println("running parameter const of WebApplication");
	}

	WebApplication(String[] supportedBrowsers)
	{
		this.supportedBrowsers=supportedBrowsers;
		for( int index=0;index<supportedBrowsers.length; index++)
		{
			String info= supportedBrowsers[index];
		System.out.println("supportedBrowsers with array index="+index+ "are " +info);
		}
		}
	
	void setMethod(boolean free)
	{
		this.free=free;
		System.out.println("setter method of the free");
	}
	void connectInternet()
	{	
	System.out.println("WebApplication is used for connectInternet");
	}
	void sendUsage()
	{
	System.out.println("WebApplication is used for sendUsage");
	}
	}