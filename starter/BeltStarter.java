package xworkz.com.methodoverriding.starter;

import xworkz.com.methodoverriding.Belt;

public class BeltStarter {
	public static void main(String args[])
	{
		Belt belt=new Belt();
		System.out.println(belt);
		System.out.println(belt.hashCode());
		System.out.println(System.identityHashCode(belt));
		
		Belt belt2=new Belt();
		System.out.println(belt2);
		System.out.println(belt.hashCode());
		System.out.println(System.identityHashCode(belt2));
		
		belt.setMaterial("soft");
		belt.setMaterial("hard");
		boolean equal=belt.equals(belt);
		System.out.println(equal);
		
	}

}
