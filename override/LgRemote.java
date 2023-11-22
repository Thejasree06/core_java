class LgRemote extends Remote
{
	double warrenty;
	int totalBatteries;
	
	LgRemote(double warrenty,int totalBatteries,RemoteusedFor usedFor,String original,int totalButtons)
	{
		super(totalButtons,original,usedFor);
		this.warrenty=warrenty;
		this.totalBatteries=totalBatteries;
	}
	
	void voiceCommand()
	{
		System.out.println("Starting no arg constructor in lgremote");
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
