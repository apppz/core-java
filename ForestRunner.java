class ForestStarter
{
public static void main(String[] args)
{
boolean reserved=true;
Forest forest=new Forest("karnataka","abc",reserved);
System.out.println(reserved.name);
System.out.println(reserved.location);
System.out.println(reserved.reserved);
System.out.println(reserved.state);


 reserved.state=new State("abc","xyz",9);
 System.out.println(reserved.state);
 System.out.println(reserved);
 System.out.println(reserved.state.name);
 System.out.println(reserved.state.cmName);
 System.out.println(reserved.state.noOfDistricts);
 
 
 reserved.state.capitalCity=new CapitalCity(1110);
 System.out.println(reserved.state.capitalCity);
 System.out.println(reserved.state.capitalCity.name);
 System.out.println(reserved.state.capitalCity.population);
 System.out.println(reserved.state.capitalCity.famousFor);
}
}