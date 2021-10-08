class MiPhoneStarter
{
public static void main(String[] args)
{
MiPhone phone=new MiPhone();

phone.setBrand("Apple");
System.out.println(phone.brand);

phone.setPrice(22000);
System.out.println(phone.price);

phone.setColor("blue");
System.out.println(phone.color);

phone.setImei(34764661);
System.out.println(phone.imei);
}
}