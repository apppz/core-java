package xworkz.com.methodoverriding.starter;

import xworkz.com.methodoverriding.Headset;

public class HeadsetStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Headset headset=new Headset();
		System.out.println(headset);
		System.out.println(headset.hashCode());
		System.out.println(System.identityHashCode(headset));
		
		Headset headset2=new Headset();
		System.out.println(headset2);
		System.out.println(headset.hashCode());
		System.out.println(System.identityHashCode(headset2));
		
		headset.setBrand("HD1901");
		headset.setBrand("HD19661");
		boolean equal=headset.equals(headset);
		System.out.println(equal);

		
		
	}

}
