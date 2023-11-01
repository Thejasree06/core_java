class WalletsStart
{
	public static void main(String[] args)
	{
		Wallets wallets=new Wallets("brand");
        System.out.println("Wallet brand is:"+wallets.brand);
		
		Wallets wallets1=new Wallets("brand",500);
        System.out.println("Wallet brand is:"+wallets1.brand);
		System.out.println("Wallet cost is:"+wallets1.cost);
		
		Wallets wallets2=new Wallets("brand",500,"red");
        System.out.println("Wallet brand is:"+wallets2.brand);
		System.out.println("Wallet cost is:"+wallets2.cost);
		System.out.println("Wallet color is:"+wallets2.color);
		
		Wallets wallets3=new Wallets("brand",500,"red",102);
        System.out.println("Wallet brand is:"+wallets3.brand);
		System.out.println("Wallet cost is:"+wallets3.cost);
		System.out.println("Wallet color is:"+wallets3.color);
		System.out.println("Wallet no is:"+wallets3.no);
		
	}
}	
		
		
		
		
		
		
		
        
        		
        		
	


