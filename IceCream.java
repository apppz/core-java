class IceCream
{
String flavour="vanilla";
Color color=Color.BLACK;//enum
float temp;
String type;
Brand brand;

IceCream(float temp)
{
this.temp=temp;
}

IceCream(float temp,String flavour,Color color)
{
this(temp);
this.flavour=flavour;
this.color=color;
}
IceCream()
{
	
}
}