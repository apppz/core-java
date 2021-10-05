class SwordRunner
{
public static void main(String[] args)
{
Sword sword=new Sword("sword",145.0f,1.8f);
sword.fighting();
sword.show();
sword.display();

System.out.println(sword.type);
System.out.println(sword.length);
System.out.println(sword.weight);
}

}