class Reverse{
public static void main(String[] args){
String a="usha";
String b="Arpitha";
System.out.println("Before reverse:");
System.out.println("the value of a\t" +a);
System.out.println("the value of b\t" +b);


a=a+b;
b=a.substring(0,a.length()-b.length());
a=a.substring(b.length());
System.out.println("After reverse:");
System.out.println("the value of a\t" +a);
System.out.println("the value of b\t" +b);

}
}