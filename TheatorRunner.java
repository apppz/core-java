class TheatorRunner
{
public static void main(String[] args)
{
TicketPrice tp=TicketPrice.GANDHI;
System.out.println(tp.price);

TicketPrice btp= TicketPrice.BOX;
System.out.println(btp.price);
System.out.println(btp.tax);
}
}