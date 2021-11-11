package xworkz.com.methodoverriding.starter;

import xworkz.com.methodoverriding.Shoe;
import xworkz.com.methodoverriding.Socks;

public class ShoeStarter {
	public static void main(String args) {
		
	
	
	Shoe shoe=new Shoe();
	System.out.println(shoe);
	System.out.println(shoe.hashCode());
	System.out.println(System.identityHashCode(shoe));
	
	Shoe shoe2=new Shoe();
	System.out.println(shoe2);
	System.out.println(shoe2.hashCode());
	System.out.println(System.identityHashCode(shoe2));
	
	shoe2.setBrand("Bata");
	shoe2.setBrand("paris richie");
	boolean equal=shoe2.equals(shoe2);
	System.out.println(equal);
	}
}
