class KeyChainStart
{
	public static void main(String[] args)
	{
		KeyChain keyChain=new KeyChain();
		System.out.println("KeyChain design is:"+keyChain.design);
		System.out.println("KeyChain cost is:"+keyChain.cost);
		System.out.println("KeyChain noofkeys is:"+keyChain.noOfKeys);
		System.out.println("KeyChain type is:"+keyChain.type);
		System.out.println("KeyChain used is:"+keyChain.usedTo);
		
		KeyChain keyChain1=new KeyChain("flower",2500);
		System.out.println("KeyChain design is:"+keyChain1.design);
		System.out.println("KeyChain cost is:"+keyChain1.cost);
		System.out.println("KeyChain noofkeys is:"+keyChain1.noOfKeys);
		System.out.println("KeyChain type is:"+keyChain1.type);
		System.out.println("KeyChain used is:"+keyChain1.usedTo);
		
		KeyChain keyChain2=new KeyChain("flower",2500,25);
		System.out.println("KeyChain design is:"+keyChain2.design);
		System.out.println("KeyChain cost is:"+keyChain2.cost);
		System.out.println("KeyChain noofkeys is:"+keyChain2.noOfKeys);
		System.out.println("KeyChain type is:"+keyChain2.type);
		System.out.println("KeyChain used is:"+keyChain2.usedTo);
		
		KeyChain keyChain3=new KeyChain("flower",2500,25,"gold");
		System.out.println("KeyChain design is:"+keyChain3.design);
		System.out.println("KeyChain cost is:"+keyChain3.cost);
		System.out.println("KeyChain noofkeys is:"+keyChain3.noOfKeys);
		System.out.println("KeyChain type is:"+keyChain3.type);
		System.out.println("KeyChain used is:"+keyChain3.usedTo);
		
		KeyChain keyChain4=new KeyChain("flower",2500,25,"gold","hand");
		System.out.println("KeyChain design is:"+keyChain4.design);
		System.out.println("KeyChain cost is:"+keyChain4.cost);
		System.out.println("KeyChain noofkeys is:"+keyChain4.noOfKeys);
		System.out.println("KeyChain type is:"+keyChain4.type);
		System.out.println("KeyChain used is:"+keyChain4.usedTo);
		
	}
	
}