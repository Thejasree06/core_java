class PersonUnique
{
	public static void main(String[] args)
	{
		Person1 person1=new Person1();
		person1.setName("Shree");
		person1.showInfo();ss
		
		
		Email email=new Email("TEju",23,"jhf","jhj");
		email.showInfo();
		
		Email email2=new Email("tanu",33,"abc","hij");
		email2.showInfo();
		
		Email[] emailArray=new Email[3];
		emailArray[2]=email;
		emailArray[1]=email;
		
		System.out.println(emailArray[1]);
		Email ref=emailArray[1];
		
		
		
	}
}