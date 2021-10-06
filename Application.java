class Application
{
String name2="zomoto";
float version=1;
Company company;

Application(String name,float version)
{
this.name=name;
this.version=version;	
}

void displayDetails()
{
	System.out.println(this.name);
	System.out.println(this.version);
	System.out.println(this.company);
}
}