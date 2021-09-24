class CountryRunner
{
public static void main(String[] boards)
{
String name="India";
int noOfStates=29;
String primeMinisterName="Narendra modhi";
String presidentWifeName="Savitha kovindh";


Country count=new Country(name,noOfStates,primeMinisterName,presidentWifeName);

System.out.println(count.name);

System.out.println(count.noOfStates);
System.out.println(count.primeMinisterName);
System.out.println(count.presidentWifeName);
}

}