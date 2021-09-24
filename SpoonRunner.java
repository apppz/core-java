class SpoonRunner
{
public static void main(String[] args)
{
Spoon s=new Spoon();

int size=s.size;
float price=s.price;
String type=s.type;


s.size=4;
size=s.size;
System.out.println(size);

s.price=10;
price=s.price;
System.out.println(price);

s.type="silver";
type=s.type;
System.out.println(type);

Spoon s1=new Spoon();
System.out.println(s1.price);
System.out.println(s1.size);
System.out.println(s1.type);

Spoon s2=new Spoon();
s2.size=5;
s2.price=100;
s2.type="gold";

System.out.println(s2.size);
System.out.println(s2.price);
System.out.println(s2.type);

System.out.println(s2.price==s2.price);

}

}