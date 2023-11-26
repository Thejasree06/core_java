class Application{
	int id;
	String name;
	ApplicationType type;
	String version;
	String developer;
	String date;
	Application()
	{
			System.out.println("running no-arg const of Application");
	}
	Application(int id,String name,ApplicationType type,String version,String developer,String date)
	{
		this.id=id;
		this.name=name;
		this.type=type;
		this.version=version;
		this.developer=developer;
		this.date=date;
	}
	void run()
	{
		System.out.println("Application is used for run");
		stop();
		execute();
		collectinfo();
		displayinfo();
		
	}
	void stop()
	{
 	System.out.println("Application is used for stop");
	}
	void execute()
	{
	System.out.println("Application is used for execute");
	}
	void collectinfo()
	{
	System.out.println("Application is used for collectinfo");
	}
		void displayinfo()
	{
	System.out.println("Application is used for displayinfo");
	}
}
	
	