class ContractorStarter
{
public static void main(String[] args)
{
Contractor contrator=new Contractor();


String name=Contractor.getName();
System.out.println("contarctor name"+ name);

String age=Contractor.getAge();
System.out.println("contarctor name"+ age);

String since=Contractor.getSince();
System.out.println("contarctor name"+ since);

String experience=Contractor.getExperience();
System.out.println("contarctor name"+ experience);

String location=Contractor.getLocation();
System.out.println("contarctor name"+location);

String qualification=Contractor.getQualification();
System.out.println("contarctor name"+ qualification);

Contractor.setName("arpitha");
String name1=contarctor.getName();
System.out.println("new name"+name);

Contractor.setAge("00");
String age1=contarctor.getAge();
System.out.println("new name"+age1);

Contractor.setSince("0000");
String since1=contarctor.getSince();
System.out.println("new name"+since1);

Contractor.setQualification("BE");
String qualification=contarctor.getQualification();
System.out.println("new name"+qualification);

Contractor.setExperience("00");
String experience1=contarctor.getExperience();
System.out.println("new name"+experience);

Contractor.setLocation("ckm");
String location1=contarctor.getLocation();
System.out.println("new name"+location);

Contractor.setName("arpitha");
String name1=contarctor.getName();
System.out.println("new name"+name);
}
}