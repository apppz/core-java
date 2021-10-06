class Currency
{
String name;
Country1 country=new Country1();
float value;
Application application=new Application();

Currency(String name,float value)
{
this.name=name;
this.value=value;
}
Currency()
{
	
}

void displayDetails()
{
	
System.out.println(this.name);
System.out.println(this.country);
System.out.println(this.value);
}
}