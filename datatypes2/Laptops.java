class Laptops{
	
	Owner owner;
	Brand brand;
	Hardware[] hardware;
	
	Laptops(Owner owner,Brand brand,Hardware[] hardware)
	{
		this.owner=owner;
		this.brand=brand;
		this.hardware=hardware;
	}		
	
	void show()
	{
			System.out.println("show information of Laptop");
		    System.out.println("Owner :"+this.owner);
			if(this.owner!=null)
			{
				this.owner.show();
			}
			System.out.println("Brand :"+this.brand);
			if(this.brand!=null)
			{
				this.brand.show();
			}
		    System.out.println("Hardware :"+this.hardware);
			if(this.hardware!=null)
			{
				for(int seq=0; seq<this.hardware.length; seq++)
				{
					Hardware ref=this.hardware[seq];
					System.out.println("hardware:"+ref+ " of " +seq); 
					
					
				}
			}
		System.out.println("End information of Laptop");
	}
}