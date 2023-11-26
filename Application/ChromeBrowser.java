class ChromeBrowser extends Browser{
	
	ChromeBrowser()
	{
		System.out.println("rumming no arg const of ChromeBrowser");
	}
	@Override
	void settings()
	{
		System.out.println("Browser is used for settings");
		System.out.println("ChromeBrowser is used for settings");
	}
	@Override
	void displayHistory()
	{
		System.out.println("Browser is used for displayHistory");
		System.out.println("ChromeBrowser is used for displayHistory");

	}
	@Override
	void run()
	{
		stop();
		execute();
		collectinfo();
		displayinfo();
	}
}