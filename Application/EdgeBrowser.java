class EdgeBrowser extends Browser{
	
	EdgeBrowser()
	{
		System.out.println("rumming no arg const of EdgeBrowser");
	}
	@Override
	void settings()
	{
		System.out.println("Browser is used for settings");
		System.out.println("EdgeBrowser is used for settings");
	}
	@Override
	void displayHistory()
	{
		System.out.println("Browser is used for displayHistory");
		System.out.println("EdgeBrowser is used for displayHistory");

	}
	
}