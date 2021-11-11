package xworkz.com.methodoverriding.starter;

import xworkz.com.methodoverriding.Tyre;

public class TyreRunner {
	
	public static void main(String args[])
	{
		Tyre tyre=new Tyre();
		System.out.println(tyre);
		System.out.println(tyre.hashCode());
		System.out.println(System.identityHashCode(tyre));
		
		Tyre tyre2=new Tyre();
		System.out.println(tyre2);
		System.out.println(tyre2.hashCode());
		System.out.println(System.identityHashCode(tyre2));
		
		tyre2.setBrand("banglore");
		tyre2.setBrand("manglore");
		boolean equal=tyre2.equals(tyre2);
		System.out.println(equal);
		
		
	}

}
