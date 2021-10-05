class IpodRunner
{
public static void main(String[] args)
{
Ipod ipod=new Ipod();
ipod.name="apple";
ipod.brand="apple";
ipod.color=IpodColor.RED;
ipod.price=900.0f;
ipod.weight=10;

Ipod ipod1=new Ipod();
ipod1.name="samsung";
ipod1.brand="samsung";
ipod1.color=IpodColor.BLACK;
ipod1.price=700.0f;
ipod1.weight=20;

ipod.gaming();
ipod.music();

ipod1.gaming();
ipod1.music();
}
}