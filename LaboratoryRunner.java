class LaboratoryRunner
{
public static void main(String[] args)
{
String name="cs";
String location="1st floor";
int noOfRooms=2;


String op1="Omkar";
String op2="Arpitha";
String op3="usha";
String op4="mallu";


String[] operName={op1,op2,op3,op4};
System.out.println(operName);

Laboratory lab=new Laboratory(name,location,noOfRooms);
System.out.println(lab.name);
System.out.println(lab.location);
System.out.println(lab.noOfRooms);
System.out.println(lab.type);
System.out.println(lab.operatorNames);


}
}