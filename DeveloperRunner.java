class DeveloperRunner
{
public static void main(String[] args)
{
Developer d=new Developer();

String name=d.name;
String designation=d.designation;
Float salary=d.salary;

d.name="arpita";
name=d.name;
System.out.println(name);

d.designation="full stack developer";
designation=d.designation;
System.out.println(designation);


d.salary=60000.0f;
salary=d.salary;
System.out.println(salary);

}
}