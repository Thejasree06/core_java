class KeyChain
{
	String design;
	double cost;
	int noOfKeys;
	String type;
	String usedTo;
	
	KeyChain()
	{
		this("flower",2500,25,"gold","hand");
	}
	KeyChain(String design,double cost)
	{
		this.design=design;
		this.cost=cost;
		System.out.println("keychain design:"+design+",keyChain cost:"+cost);
	}
	KeyChain(String design,double cost,int noOfKeys)
	{
		this(design,cost);
		this.noOfKeys=noOfKeys;
		System.out.println("keychain design:"+design+",keyChain cost:"+cost+",keychain keys:"+noOfKeys);
	}
	KeyChain(String design,double cost,int noOfKeys,String type)
	{
		this(design,cost,noOfKeys);
		this.type=type;
		System.out.println("keychain design:"+design+",keyChain cost:"+cost+",keychain keys:"+noOfKeys+",keychain type:"+type);
	}
	KeyChain(String design,double cost,int noOfKeys,String type,String usedTo)
	{
		this(design,cost,noOfKeys,type);
		this.usedTo=usedTo;
		System.out.println("keychain design:"+design+",keyChain cost:"+cost+",keychain keys:"+noOfKeys+",keychain type:"+type+","+usedTo);
	}
}
