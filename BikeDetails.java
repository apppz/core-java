class Bike
{
public static void getDetailsOfBike(String company,float price, String colour,int regno,int rcno,String ownername,float weight)
{
System.out.println("bike name");
System.out.println(company+"\n"+price+"\n"+colour+"\n"+regno+"\n"+rcno+"\n"+ownername+"\n"+ weight);

}
}

class BikeDetails
{

public static void main(String[] details)
{
Bike.getDetailsOfBike("bullet", 200, "red", 76, 78, "Arpitha", 200);

}
}