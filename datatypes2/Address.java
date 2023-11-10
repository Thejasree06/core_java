class Address{
	
	String street;
	int pincode;
	Cityy cityy;
	
	Address()
	{
	}
	 
	 void setStreet(String street)
	 {
		 this.street=street;
	 }
	 
	 void setPincode(int pincode)
	 {
		 this.pincode=pincode;
		
	 }
	 void cityMethod(Cityy cityy)
	 {
		 this.cityy=cityy;
	 }
	 
	 void show()
	 {
		 System.out.println("show information of Address");
	      System.out.println("Street :"+this.street);
			System.out.println("pincode :"+this.pincode);
			System.out.println("city :"+this.cityy);
			if(this.cityy!=null)
			{
				this.cityy.show();
			}
			
          System.out.println("end information of Address");
}
}