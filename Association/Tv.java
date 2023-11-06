class Tv
{
	String display;
	Speaker speaker;
	
	Tv(String display)
	{
		this.display=display;
	}
	Tv(Speaker speaker)
	{
		this.speaker=speaker;
	}
	void showInfo()
	{
		
		System.out.println("Display:"+this.display);
		System.out.println("speaker:"+this.speaker);
		if(this.speaker!=null)
		{
			System.out.println("Max volume:"+this.speaker.maxVolume);
		}
	}
	
}
