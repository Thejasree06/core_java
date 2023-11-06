class Clinic
{
	String specialization="eye";
	int totalBeds=20;
	int totalPatients=25;
	Doctor doctor;
	
	Clinic(Doctor doctor)
	{
		this.doctor=doctor;
	}
	
	void displayInfo()
	{
		System.out.println("Specialization:"+this.specialization);
		System.out.println("Total Beds:"+this.totalBeds);
		System.out.println("Total patients:"+this.totalPatients);
		if(this.doctor!=null)
		{
			System.out.println("Total patients:"+this.doctor.name);
			System.out.println("Exp:"+this.doctor.exp);
			System.out.println("fake:"+this.doctor.value);
			System.out.println("Fees:"+this.doctor.fees);
		}
	}
}