class ClockStart
{
	public static void main(String[] args)
	{
		Clock clock=new Clock(12);
		System.out.println("no:"+clock.no);
		
		Clock clock1=new Clock(12,50);
		System.out.println("no:"+clock1.no);
		System.out.println("cost:"+clock1.cost);
		
		Clock clock2=new Clock(12,50,"wall");
		System.out.println("no:"+clock2.no);
		System.out.println("cost:"+clock2.cost);
		System.out.println("brand:"+clock2.brand);
		
		Clock clock3=new Clock(12,50,"wall","Red");
		System.out.println("no:"+clock3.no);
		System.out.println("cost:"+clock3.cost);
		System.out.println("brand:"+clock3.brand);
		System.out.println("color:"+clock3.color);
		
		
		
	}
}