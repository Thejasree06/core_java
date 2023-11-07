class Mains
{
	public static void main(String[] main)
	{
		Tent tent;
		tent=new Tent();
		tent.showInfo();
		Agent agent=new Agent();
		agent.openTent(tent);
		agent.closeTent(tent);
		agent.showInfo();
	}
}

