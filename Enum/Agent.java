class Agent
{
	int id;
	String name;
	Tent tent;
	
	void openTent(Tent tent)
	{
		tent.open();
	}
	void closeTent(Tent tent)
	{
		tent.close();
	}
	void showInfo()
	{
		System.out.println("10:"+this.id);
		System.out.println("Name:"+this.name);
	}
}