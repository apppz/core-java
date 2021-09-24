class HospitalRunner
{
public static void main (String[] handhigalu)
{

String name="Ashraya";
String location="banglore";
String owner="Arpitha";
int noOfBeds=99;

Hospitals hos=new Hospitals(name,location,owner,noOfBeds);

System.out.println(hos.name);
System.out.println(hos.location);
System.out.println(hos.owner);
System.out.println(hos.noOfBeds);
}
}
