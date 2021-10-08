class Product
{
String name;
String type;
float price;
float quantity;
int vendor;
float totalProductsPrice;

Product(String name,String type,float price,float quantity,int vendor)
{
this.name=name;
this.type=type;
this.price=price;
this.quantity=quantity;
this.vendor=vendor;	
}

Product(String name,String type,float quantity)
{
	this.name=name;
	this.type=type;
	this.quantity=quantity;
}

void productDetails()
{
System.out.println(this.name=name);
System.out.println(this.type=type);
System.out.println(this.price=price);
System.out.println(this.quantity=quantity);
System.out.println(this.vendor);

}

void printTotalCost()
{
	float total=this.price*this.quantity;
	System.out.println(total);
	totalProductsPrice=totalProductsPrice+total;	
}
}