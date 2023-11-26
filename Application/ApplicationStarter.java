class ApplicationStarter
{
		public static void main(String... args) //var args
	{
		System.out.println("Starting main method of ApplicationStarter");
		Application app=new Application();
		Application app1=new Application(001,"instagram",ApplicationType.SPREEDSHEET,"i3ver","krish","jan-2000");
		System.out.println("id"+app1.id);
		System.out.println("name"+app1.name);
		System.out.println("type"+app1.type);
		System.out.println("version"+app1.version);
		System.out.println("developer"+app1.developer);
		System.out.println("date"+app1.date);
		app1.run();
		app1.stop();
		app1.execute();
		app1.collectinfo();
		app1.displayinfo();
		
		StandaloneApplication sda=new StandaloneApplication();
		StandaloneApplication sda1=new StandaloneApplication(4,"cmd",ApplicationOs.UNIX);
		System.out.println("size"+sda1.size);
		System.out.println("compatabilewith"+sda1.compatabilewith);
		System.out.println("os"+sda1.os);
		sda1.consumerMemory();
		sda1.consumeInternet();
		
		WebApplication wb=new WebApplication();
		String[] ref={"window","wiki"};
		WebApplication wb1=new WebApplication(ref);
		// String[] ref={"window","wiki"};
		wb1.setMethod(true);
		wb1.connectInternet();
		wb1.sendUsage();
		
		Browser brow=new Browser();
		String[] ref1={"googale","playstore"};
		String[] ref2={"2daysago","3daysago"};
		Browser brow1=new Browser(ref1,ref2);
		brow1.settings();
		brow1.displayHistory();
		
		
		ChromeBrowser cb=new ChromeBrowser();
		EdgeBrowser eb=new EdgeBrowser();
		FireFoxBrowser fb=new FireFoxBrowser();

		System.out.println("Ending main method of ApplicationStarter");
	}
		}