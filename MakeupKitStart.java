class MakeupKitStart
{
	public static void main(String[] arg)
	{
		MakeupKit makeupKit=new MakeupKit("Lakme");
		System.out.println("brand:"+makeupKit.brand);
		
		MakeupKit makeupKit1=new MakeupKit("Lakme","Bigkit");
		System.out.println("brand:"+makeupKit1.brand);
		System.out.println("item:"+makeupKit1.item);
		
		MakeupKit makeupKit2=new MakeupKit("Lakme","Bigkit",1000);
		System.out.println("brand:"+makeupKit2.brand);
		System.out.println("item:"+makeupKit2.item);
		System.out.println("cost:"+makeupKit2.cost);
		
		MakeupKit makeupKit3=new MakeupKit("Lakme","Bigkit",1000,101);
		System.out.println("brand:"+makeupKit3.brand);
		System.out.println("item:"+makeupKit3.item);
		System.out.println("cost:"+makeupKit3.cost);
		System.out.println("no:"+makeupKit3.no);
	}
}	
		
		
		
		
		
		
		
		
		
		
	
