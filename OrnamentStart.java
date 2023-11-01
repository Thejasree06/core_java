class OrnamentStart
{
	public static void main(String[] args)
	{
		Ornament ornament=new Ornament("Gold");
		System.out.println("Ornament type is:"+ornament.type);
		
		Ornament ornament1=new Ornament("Gold","yellow");
		System.out.println("Ornament type is:"+ornament1.type);
		System.out.println("Ornament color is:"+ornament1.color);
		
		Ornament ornament2=new Ornament("Gold","yellow",'s');
		System.out.println("Ornament type is:"+ornament2.type);
		System.out.println("Ornament color is:"+ornament2.color);
		System.out.println("Ornament size is:"+ornament2.size);
		
		Ornament ornament3=new Ornament("Gold","yellow",'s',111);
		System.out.println("Ornament type is:"+ornament3.type);
		System.out.println("Ornament color is:"+ornament3.color);
		System.out.println("Ornament size is:"+ornament3.size);
		System.out.println("Ornament no is:"+ornament3.no);
		
		
		
		
		
		
	}
	
}