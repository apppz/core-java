package xworkz.com.methodoverriding.starter;

import xworkz.com.methodoverriding.IceCream;

public class IceCreamStarter {

	public static void main(String[] args) {
		IceCream ice=new IceCream();
		System.out.println(ice);
		System.out.println(ice.hashCode());
		System.out.println(System.identityHashCode(ice));
		
		IceCream ice2=new IceCream();
		System.out.println(ice2);
		
		

	}

}
