class Remote
{
	RemoteusedFor usedFor;
	int totalButtons;
	String original;
	
	Remote(int totalButtons,String original,RemoteusedFor usedFor)
	{
		this.usedFor=usedFor;
		this.totalButtons=totalButtons;
		this.original=original;
		System.out.println("Starting no arg constructor in Remote");
	}
	void on()
	{
		System.out.println("starting no arg in Remote on");
	}
	void off()
	{
		System.out.println("Starting no arg in remote off");
	}
	void increaseVolume()
	{
		System.out.println("Starting no arg in remote increasevolume");
	}
	void decreaseVolume()
	{
		System.out.println("Starting no arg in remote decreasevolume");
	}
	void changeChannel()
	{
		System.out.println("Starting no arg in remote decreasevolume");
	}
	
}