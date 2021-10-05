class Ipod
{
String name;
String brand;
IpodColor color;
float price;
float weight;


void gaming()
{
System.out.println("invoked gaming");
System.out.println("ipod details");
System.out.println(name);
System.out.println(brand);
System.out.println(color);
System.out.println(price);
System.out.println(weight);
this.music();
}
static void music()
{
System.out.println("invoked music");
}
}