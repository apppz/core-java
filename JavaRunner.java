class JavaRunner
{
public static void main(String[] wine)
{
String location="ballary";
String name="ballary central jail";
int yearOfConstruction=1872;
Jail jail=new Jail(location,name,yearOfConstruction);
System.out.println(jail.location);
System.out.println(jail.name);
System.out.println(jail.yearOfConstruction);
System.out.println(jail.noOfCells);
System.out.println(jail.noOfCriminals);
System.out.println(jail.personnel);
System.out.println(jail.areaInAcres);
System.out.println(jail.strict);
}
}