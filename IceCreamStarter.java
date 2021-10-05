class IceCreamStarter
{
public static void main(String[] args)
{
IceCream cream=new IceCream(-20,"vanilla",Color.BLACK);
System.out.println(cream.flavour);
System.out.println(cream.temp);
System.out.println(cream.type);
System.out.println(cream.brand);
System.out.println(cream.color);
cream.type="cone";


cream.brand=new Brand();
System.out.println(cream.brand);
System.out.println(cream);


//to get flavout from irccream and store it using var

String fla=cream.flavour;
//System.out.println(fla);

float temp=cream.temp;
//System.out.println(temp);

Brand brand=cream.brand;
//System.out.println(brand);

}
}