class Medicine
{
public static float getMedicineTotal(String name,String campany,float price,int quantity)
{
System.out.println("name");
System.out.println(name+"\n"+campany+"\n"+price+"\n"+quantity);
float total=quantity*price;
System.out.println("total="+total);
return total;
}
}


class MedicineDetails
{
	public static void main(String[] vals)
	{
		Medicine.getMedicineTotal("dolo650","dolo",20f,1);
		Medicine.getMedicineTotal("citragen","citra",30f,2);
		Medicine.getMedicineTotal("eldopher","eldo",50f,5);
		
	}
	
}