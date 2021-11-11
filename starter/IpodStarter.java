package xworkz.com.methodoverriding.starter;

import xworkz.com.methodoverriding.Ipod;

public class IpodStarter {

	public static void main(String[] args) {
		
		Ipod ipod=new Ipod();
		System.out.println(ipod);
		System.out.println(ipod.hashCode());
		System.out.println(System.identityHashCode(ipod));
		Ipod ipod2=new Ipod();
		System.out.println(ipod2.hashCode());
		System.out.println(System.identityHashCode(ipod2));
		String day="good";
		System.out.println(day.hashCode());
		
		
		
		ipod.setModelNo("HD1901");
		ipod.setModelNo("HD19661");
		boolean equal=ipod.equals(ipod);
		System.out.println(equal);

	}

}
