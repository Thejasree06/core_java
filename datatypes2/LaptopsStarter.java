class LaptopsStarter{
	
	public static void main(String args[])
	{
		System.out.println("Starting of the main method");
		
		Cityy cityy=new Cityy(); //create instance for class 
		
		Address address=new Address();
		address.setStreet("bhomanahali");
		address.setPincode(577555);
		address.cityMethod(cityy);
		
		Owner owner=new Owner();
		owner.setName("rama","rama123.gmail",address,address);
		
		
		String[] cities=new String[5];
		cities[0]="dvg";
		cities[1]="chitradurga";
		cities[2]="mysore";
		cities[3]="bangalor";
		cities[4]="mandya";
		Brand brand=new Brand(cities);
		
		Hardware[] hardware=new Hardware[10];
		hardware[0]=new Hardware("Mouse","wire");
		hardware[1]=new Hardware("keyBord","key");
		hardware[2]=new Hardware("printer","print");
		hardware[3]=new Hardware("Ploter","plot");
		hardware[4]=new Hardware("Joystic","joy");
		hardware[5]=new Hardware("Cpu","cpu");
	    hardware[6]=new Hardware("Ram","ram");
		hardware[7]=new Hardware("Monitor","moni");
		hardware[8]=new Hardware("Speaker","sep");
		hardware[9]=new Hardware("Drive","dri");
		
		Laptops laptops= new Laptops(owner,brand,hardware); //this is for non static variable
		
		laptops.show();
		
	System.out.println("ending of the main method");
	
}
}