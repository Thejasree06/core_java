class Printer
{
  String model;
  int capacity;
  int cost;
  String brand;
  double rating;
  
  Printer()
  {
	 this("xenon",55,1000,"abc",4.5);
  }
  Printer(String model,int capacity,int cost)
  {
	  this.model=model;
	  this.capacity=capacity;
	  this.cost=cost;
	  System.out.println("printer model is:"+model+","+capacity+","+cost);
  }
  Printer(String model,int capacity,int cost,String brand)
  {
	  this(model,capacity,cost);
	  this.brand=brand;
	  System.out.println("printer capacity is:"+model+","+capacity+","+cost+","+brand);
  }
   Printer(String model,int capacity,int cost,String brand,double rating)
  {
	  this(model,capacity,cost,brand);
	  this.rating=rating;
	  System.out.println("printer capacity is:"+model+","+capacity+","+cost+","+brand+","+rating);
	  
  }
  
}
	
	
