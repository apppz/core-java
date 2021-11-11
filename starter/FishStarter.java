package xworkz.com.methodoverriding.starter;

import xworkz.com.methodoverriding.Fish;

public class FishStarter {

	public static void main(String[] args) {
		
		Fish fish=new Fish();
		System.out.println(fish);
		System.out.println(fish.hashCode());
		System.out.println(System.identityHashCode(fish));
		
		Fish fish2=new Fish();
		System.out.println(fish2);
		System.out.println(fish2.hashCode());
		System.out.println(System.identityHashCode(fish2));
		
		fish.setName("bangude");
		fish.setName("boothai");
		boolean equal=fish.equals(fish);
		System.out.println(equal);
		

	}

}
