package xworkz.com.methodoverriding.starter;

import xworkz.com.methodoverriding.Stadium;

public class StadiumStarter {

	public static void main(String[] args) {
		
		Stadium starter=new Stadium();
		System.out.println(starter);
		System.out.println(starter.hashCode());
		System.out.println(System.identityHashCode(starter));
		
		

		Stadium starter2=new Stadium();
		System.out.println(starter2);
		System.out.println(starter2.hashCode());
		System.out.println(System.identityHashCode(starter2));
		
		starter.setName("mango");
		starter.setName("orange");
		boolean equal=starter.equals(starter);
		System.out.println(equal);
		
	}

}
