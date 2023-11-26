class FireFoxBrowser extends Browser{
	
	FireFoxBrowser()
	{
		System.out.println("rumming no arg const of FireFoxBrowser");
	}
	@Override
	void settings()
	{
		System.out.println("Browser is used for settings");
		System.out.println("FireFoxBrowser is used for settings");
	}
	@Override
	void displayHistory()
	{
		System.out.println("Browser is used for displayHistory");
		System.out.println("FireFoxBrowser is used for displayHistory");

	}
	
}