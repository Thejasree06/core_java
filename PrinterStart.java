class PrinterStart
{
	public static void main(String[] args)
	{
		Printer printer=new Printer();
		System.out.println("printer name is:"+printer.model);
		System.out.println("printer capacity is:"+printer.capacity);
		System.out.println("printer cost is:"+printer.cost);
		System.out.println("printer brand is:"+printer.brand);
		System.out.println("printer double is:"+printer.rating);
		
		Printer printer1=new Printer("xenon",55,1000);
		System.out.println("printer name is:"+printer1.model);
		System.out.println("printer capacity is:"+printer1.capacity);
		System.out.println("printer cost is:"+printer1.cost);
		System.out.println("printer brand is:"+printer1.brand);
		System.out.println("printer double is:"+printer1.rating);
		
		Printer printer2=new Printer("xenon",55,1000);
		System.out.println("printer name is:"+printer2.model);
		System.out.println("printer capacity is:"+printer2.capacity);
		System.out.println("printer cost is:"+printer2.cost);
		System.out.println("printer brand is:"+printer2.brand);
		System.out.println("printer double is:"+printer2.rating);
		
		Printer printer3=new Printer("xenon",55,1000,"abc");
		System.out.println("printer name is:"+printer3.model);
		System.out.println("printer capacity is:"+printer3.capacity);
		System.out.println("printer cost is:"+printer3.cost);
		System.out.println("printer brand is:"+printer3.brand);
		System.out.println("printer double is:"+printer3.rating);
		
		Printer printer4=new Printer("xenon",55,1000,"abc",4.5);
		System.out.println("printer name is:"+printer4.model);
		System.out.println("printer capacity is:"+printer4.capacity);
		System.out.println("printer cost is:"+printer4.cost);
		System.out.println("printer brand is:"+printer4.brand);
		System.out.println("printer double is:"+printer4.rating);
		
		
		
		
		
		
		
		
	}
}