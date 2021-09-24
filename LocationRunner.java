class LocationRunner
{
public static void main(String[] locals)
{
String name="chikmaglur";
String state="karnataka";
String famousFor="hills";
int bestTimeToVisit=6;

Location locate=new Location(name,state,famousFor,bestTimeToVisit);

System.out.println(locate.name);
System.out.println(locate.state);
System.out.println(locate.famousFor);
System.out.println(locate.bestTimeToVisit);


}
}