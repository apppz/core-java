package xworkz.com.methodoverriding.starter;

import xworkz.com.methodoverriding.Bag;

public class BagRunner {

	public static void main(String[] args) {
		
		Bag bag=new Bag();
		System.out.println(bag);
		System.out.println(bag.hashCode());
		System.out.println(System.identityHashCode(bag));
		
		Bag bag1=new Bag();
		System.out.println(bag1);
		System.out.println(bag.hashCode());
		System.out.println(System.identityHashCode(bag1));
		
		bag.setColor("vacco");
		bag.setColor("baggy");
		boolean equal=bag.equals(bag);
		System.out.println(equal);

	}

}
