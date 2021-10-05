class GrinderRunner
{
public static void main(String[] args)
{
Grinder grinder=new Grinder(10,"prestige");
System.out.println(grinder.capacity);
System.out.println(grinder.company);
Motor motor=grinder.motor;
System.out.println(motor.model);
System.out.println(motor.rpm);
}
}