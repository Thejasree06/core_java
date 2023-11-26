class StandaloneApplication  extends Application
{
	int size;
	String compatabilewith;
	ApplicationOs os;
	
	StandaloneApplication()
	{
		System.out.println("running no-arg const of StandaloneApplication");
	}
	StandaloneApplication(int id,String name,ApplicationType type,String version,String developer,String date)
	{   
	    super(id,name,type,version,developer,date);
		System.out.println("running parameter const of StandaloneApplication");
	}
	
	StandaloneApplication(int size,String compatabilewith,ApplicationOs os)
	{
		this.size=size;
		this.compatabilewith=compatabilewith;
		this.os=os;
	}
	void consumerMemory()
	{
	System.out.println("StandaloneApplication is used for consumerMemory");
	}
	void consumeInternet()
	{
		System.out.println("StandaloneApplication is used for consumeInternet");
	}
}