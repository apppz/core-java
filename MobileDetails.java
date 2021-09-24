class Mobile
{
public static float getMobileDetails(String brand,String color,String model,float price,int quantity,String country)
{
System.out.println("Brand");
System.out.println(brand+"\n"+color+"\n"+model+"\n"+price+"\n"+quantity+"\n"+country);
float total=price*quantity;
System.out.println("total="+total);
return total;
}
}

class MobileDetails
{
	public static void main(String[] mob)
	{
		Mobile.getMobileDetails("MI","Black","pro",2000,1,"India");
		Mobile.getMobileDetails("oppo","red","pro",3000,4,"China");
	}
	
}