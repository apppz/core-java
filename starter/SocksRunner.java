package xworkz.com.methodoverriding.starter;

import xworkz.com.methodoverriding.Socks;

public class SocksRunner {

	public static void main(String[] args) {
		
		Socks socks=new Socks();
		System.out.println(socks);
		System.out.println(socks.hashCode());
		System.out.println(System.identityHashCode(socks));
		
		Socks socks1=new Socks();
		System.out.println(socks1);
		System.out.println(socks.hashCode());
		System.out.println(System.identityHashCode(socks1));
		
		socks.setName("ankle");
		socks.setName("big");
		boolean equal=socks.equals(socks);
		System.out.println(equal);
		

	}

}
