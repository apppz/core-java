package xworkz.com.methodoverriding.starter;

import xworkz.com.methodoverriding.Aeroplane;

public class AeroplaneStarter {

	public static void main(String[] args) {
		
		Aeroplane aero=new Aeroplane();
		System.out.println(aero);
		System.out.println(aero.hashCode());
		System.out.println(System.identityHashCode(aero));
		
		
		Aeroplane aero2=new Aeroplane();
		System.out.println(aero2);
		System.out.println(aero2.hashCode());
		System.out.println(System.identityHashCode(aero2));
		

		aero2.setComapany("banglore");
		aero2.setComapany("manglore");
		boolean equal=aero2.equals(aero2);
		System.out.println(equal);

	}

}
