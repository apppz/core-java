class SugarFactoryStarter
{
public static void main(String[] args)
{
SugarFactory factory=new SugarFactory(89);

//int cap=factory.capacity;
System.out.println(factory.capacity);

Machine machine=new Machine();
System.out.println(factory.machine.working);

factory.machine=machine;
factory.machine=null;
}
}