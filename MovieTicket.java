class MovieTicket
{
String movieName;
String theater;
float price;
int noOfSeats;
MovieType type;

MovieTicket(String movieName,String theater,float price,int noOfSeats,MovieType type)
{
	this.movieName=movieName;
	this.theater=theater;
	this.price=price;
	this.noOfSeats=noOfSeats;
	this.type=type;
	
}

MovieTicket(String movieName,String theater)
{
	this.movieName=movieName;
	this.theater=theater;
}

void displayDetails()
{
	System.out.println(this.movieName);
	System.out.println(this.theater);
	System.out.println(this.price);
	System.out.println(this.noOfSeats);
	System.out.println(this.type);
}

void printTotalPrice()
{
	float total=this.price*this.noOfSeats;
	System.out.println("total price" +total);
	
	
}
}