package xworkz.com.methodoverriding.starter;

import xworkz.com.methodoverriding.Watch;

public class WatchStarter {

	public static void main(String[] args) {
	
		Watch watch=new Watch();
		System.out.println(watch);
		System.out.println(watch.hashCode());
		
		Watch watch2=new Watch();
		System.out.println(watch2);
		System.out.println(watch2.hashCode());
		
		watch.setBrand("Hundai");
		watch.setBrand("Hundai");
		boolean equal=watch.equals(watch);
		System.out.println(equal);

		

	}

}
