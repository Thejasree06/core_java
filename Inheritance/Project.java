class Project
{
	Project()
	{
	System.out.println("Starting no arg constructor in project");
	}

   void validate(Personn personn)
   {
	   System.out.println("Personn :"+personn);
	   if(personn!=null)
	   {
		   if(personn instanceof Developer)
		   {
			   Developer dev=(Developer)personn;
			   dev.eat();
			   dev.sleep();
		   }
		   if(personn instanceof BusinessAnalyst)
		   {
			   BusinessAnalyst bs=(BusinessAnalyst)personn;
			   bs.checkRequirement();
		   }
		   if(personn instanceof ProductOwner)
		   {
			   ProductOwner po=(ProductOwner)personn;
			   po.validate();
		   }
		   if(personn instanceof DataBaseDeveloper)
		   {
			  DataBaseDeveloper dbd=(DataBaseDeveloper)personn;
              dbd.runScript();			  
		   }
	      if(personn instanceof Develops)
	   {
		Develops db=(Develops)personn;
        db.runBuild();		
	   }
	   if(personn instanceof Tester)
	   {
		   Tester te=(Tester)personn;
		   te.qualityCheck();
	   }
   }
   }
}
   