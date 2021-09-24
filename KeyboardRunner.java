class KeyboardRunner
{
public static void main(String[] keys)
{
	String name="hpindia";
	String type="laptop";
	int buttons=98;
Keyboard key=new Keyboard(name,type,buttons);
System.out.println(key.name);


System.out.println(key.type);
System.out.println(key.buttons);


}
} 
