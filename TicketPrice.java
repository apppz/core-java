enum TicketPrice
{
GANDHI(50,0.5f),MIDDLE(60,0.8f),BALCONY(100,1.0f),BOX(150,2.0f);

int price;
float tax;


TicketPrice(int price,float tax)
{
this.price=price;
this.tax=tax;
}
}