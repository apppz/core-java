class Corona
{
public static void getCoronaPatientsDetails(String name,int age,String admitted,String admittedTo,int infectedDays,String alive,String Discharged)
{
System.out.println("Corona patients");
System.out.println(name+"\n"+age+"\n"+admitted+"\n"+admittedTo+"\n"+infectedDays+"\n"+alive+"\n"+Discharged);
}
}

class CoronaPatientsDetails
{
	public static void main(String[] patient)
	{
	Corona.getCoronaPatientsDetails("Arpitha",24,"yes","Ashirvadh",12,"yes","yes");	
	Corona.getCoronaPatientsDetails("usha",22,"yes","malpe",14,"no","no");
	}
	
}