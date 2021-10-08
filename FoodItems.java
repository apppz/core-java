class FoodItems
{
String name;
float price;
String hotelName;
int quantity;
FoodType type;
int ratings;
FoodOrderType orderType;
static float printTotalFoodItemsPrice;


FoodItems(String name,float price,String hotelName,int quantity,FoodType type,int ratings,FoodOrderType orderType)
{
	this.name=name;
	this.price=price;
	this.hotelName=hotelName;
	this.quantity=quantity;
	this.type=type;
	this.ratings=ratings;
	this.orderType=orderType;
}


/*FoodItems(String name,float price,String hotelName)
{
	this.name=name;
	this.price=price;
	this.hotelName=hotelName;
	
}*/

void displayFoodDetails()
{
	System.out.println(this.name);
	System.out.println(this.price);
	System.out.println(this.hotelName);
	System.out.println(this.quantity);
	System.out.println(this.type);
	System.out.println(this.ratings);
	System.out.println(this.orderType);
	
}
void printTotalPrice()
{
	float total=this.price*this.quantity;
	System.out.println("total price"+total);
	printTotalFoodItemsPrice=printTotalFoodItemsPrice+total;
	
}
static void printTotalFoodItemsPrice()
{
	System.out.println("total food items price="+printTotalFoodItemsPrice);
}

 void printHotelName()
{
	String name1=this.name;
System.out.println(name1);
   float price1=this.price;
System.out.println(price);	
	
}
}
