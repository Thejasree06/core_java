class Owner{ 
		
		String name;
		String email;
	    Address permanetAdd;
		Address temporaryAdd;
		
		Owner()
		{
		}
		
		void setName(String name,String email,Address temporaryAdd, Address permanetAdd)
		{
			this.name=name;
			this.email=email;
			this.permanetAdd=permanetAdd;
			this.temporaryAdd=temporaryAdd;
		}
		
		void show()
		{
			System.out.println("show information of Owner");
	        System.out.println("Name :"+this.name);
			System.out.println("email :"+this.email);
			System.out.println("PermanetAdd :"+this.permanetAdd);
			if(this.permanetAdd!=null)
			{
				this.permanetAdd.show();
			}
			System.out.println("TemporaryAdd; :"+this.temporaryAdd);
			if(this.temporaryAdd!=null)
			{
				this.temporaryAdd.show();
			}
			System.out.println("end information of Owner");
		    
			
		}
		
		
		




}