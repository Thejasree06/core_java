class PersonUniquee
{
	public static void main(String... args)
	{
		Personn personn=new Personn();
		Developer developer=new Developer();
		Tester tester=new Tester();
		BusinessAnalyst businessAnalyst=new BusinessAnalyst();
		ProductOwner productOwner=new ProductOwner();
		DataBaseDeveloper dataBaseDeveloper=new DataBaseDeveloper();
		Develops develops=new Develops();
		
		Project pr=new Project();
		pr.validate(personn);
		pr.validate(developer);
		pr.validate(tester);
		pr.validate(businessAnalyst);
		pr.validate(productOwner);
		pr.validate(dataBaseDeveloper);
		pr.validate(develops);
		
		
		
		
		
		
	}
}
