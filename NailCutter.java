class NailCutter
{
String name;
String color;
NailCutterSize size;
String brand;
float price;
int noOfBlades;

void nailCutting()
{
	System.out.println("invoked nailCutting");
	System.out.println(name);
	System.out.println(color);
	System.out.println(size);
	System.out.println(brand);
	System.out.println(price);
	System.out.println(noOfBlades);
	
	this.trimming();
}

static void trimming()
{
System.out.println("invoked trimming");	
}
NailCutter()
{
	
}
}
