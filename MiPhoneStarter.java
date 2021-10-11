class MiPhoneStarter
{
public static void main(String[] args)
{
MiPhone phone=new MiPhone();

phone.setBrand("Mi");
System.out.println(phone.brand);

phone.setPrice(22000);
System.out.println(phone.price);

phone.setColor("blue");
System.out.println(phone.color);

phone.setImei(34764661);
System.out.println(phone.imei);

phone.setBrand("Apple");
System.out.println(phone.brand);

MiPhonePay phonePay=new MiPhonePay();
phonePay.setCompany("xiomi");
System.out.println(phonePay.company);

phonePay.setVersion(2);
System.out.println(phonePay.version);

phonePay.setArtitech("mi mobile phone");
System.out.println(phonePay.artitech);

phonePay.setWorking(true);
System.out.println(phonePay.working);


}
}