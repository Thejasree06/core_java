class Browser extends StandaloneApplication{
	
	String[] downloads;
	String[] browsingHistorysites;
	Browser()
	{
	System.out.println("running no-arg const of Browser");
	}
	Browser(int size,String compatabilewith,ApplicationOs os)
	{
		super(size,compatabilewith,os);
	System.out.println("running parameter const of Browser");
	}
	
	Browser(String[] downloads,String[] browsingHistorysites)
	{
		this.downloads=downloads;
		for( int index=0;index<downloads.length; index++)
		{
			String info= downloads[index];
		System.out.println("downloads with array index=" +index+ "downloads are " +info);
		}
		this.browsingHistorysites=browsingHistorysites;
		for(int index=0; index<browsingHistorysites.length; index++)
		{
			String info= browsingHistorysites[index];
		System.out.println("browsingHistorysites with array index=" +index+ "downloadsHistory are " +info);
		}
		
	}
	void settings()
	{
		System.out.println("Browser is used for settings");
	}
	void displayHistory()
	{
		System.out.println("Browser is used for displayHistory");
	}
	
}