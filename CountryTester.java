class Country{
public static String getCountryByPincode(int no)
{
	int code=91;
	System.out.println("invoked");
if(code==91)
{
System.out.println("91 is india");
return "India";
}
if(code==90)
{
System.out.println("90 is pakistan");
return "Pakistan";
}
if(code==01)
{
System.out.println("01 is canada");
return "canada";
}
return "NA";
}
}

class CountryTester
{
	
public static void main(String[] no)
{
	int code=91;
Country.getCountryByPincode(code);
}
}