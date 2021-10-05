class PrimeMinister
{
public static void getPrimeMinisterDetails(String name,String countryname, int age,String married,String alive,int duration)
{
System.out.println("Prime minister");
System.out.println(name+"\n"+countryname+"\n"+ age+"\n"+ married+"\n"+ alive+"\n"+duration);

}
}
class PrimeMinisterDetails
{
public static void main(String[] goodman){
PrimeMinister.getPrimeMinisterDetails("Narendra modhi","India",69,"yes","yes",5);

PrimeMinister.getPrimeMinisterDetails("bbb","India",69,"yes","yes",5);
}
}