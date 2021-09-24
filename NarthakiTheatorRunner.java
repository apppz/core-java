class NarthakiTheatorRunner
{
public static void main(String[] args)
{
Theator theator=new Theator("Narthaki",TicketPrice.BALCONY);
theator.location="masjastic";
//System.out.println(theator); it print only theator
System.out.println(theator.name);
System.out.println(theator.location);
System.out.println(theator.capacity);
System.out.println(theator.ticketPrice);


 
}

}