class Tent
{
	int slNo;
	Color color=Color.WHITE;
	int width;
	int height;
    
	boolean open()
	{
		System.out.println("open");
		return true;
	}
	boolean close()
	{
		System.out.println("close");
		return false;
	}
	void showInfo()
	{
		System.out.println("SL Name:"+slNo);
		System.out.println("color:"+color);
		System.out.println("width:"+width);
		System.out.println("height:"+height);
		
	}
}