class Person{
public static String personInfo()
{
String name,favoriteVehicle,dreamCompany;
dreamCompany="infosis";
return dreamCompany;
}


public static void printCompanyNames()
{
String c1="infosis";
String c2="wipro";
String c3="techmahindra";
String c4="capgemini";
String[] companyNames={c1,c2,c3,c4};
for(int i=0;i<4;i++){
System.out.println(companyNames[i]);
}
}

public static void printComputerBrands()
{
String cb1="hcl";
String cb2="hp";
String cb3="lenevo";
String cb4="dell";
String[] printComputerBrands={cb1,cb2,cb3,cb4};
for(int i=0;i<4;i++){
System.out.println(printComputerBrands[i]);
}
}

public static String mobileBrand()
{
String mb1="MI";
String mb2="oppo";
String mb3="vivo";
String mb4="samsung";
String[] mobileBrand={mb1,mb2,mb3,mb4};
for(int i=0;i<4;i++){
System.out.println(mobileBrand[i]);
}
return mb1;
}

public static String iplTeams(){
String t1="RCB";
String t2="CSK";
String t3="mumbai indians";
String t4="KKR";
String[] iplTeams={t1,t2,t3,t4};
for(int i=0;i<4;i++){
System.out.println(iplTeams[i]);
}
return t4;
} 
}

class Runner2{
public static void main(String[] args){
Person.personInfo();
Person.printCompanyNames();
Person.printComputerBrands();
Person.mobileBrand();
String mobileBrand
Person.iplTeams();
}

}

