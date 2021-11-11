package xworkz.com.methodoverriding.starter;

import xworkz.com.methodoverriding.Plant;
import xworkz.com.methodoverriding.constants.PlantType;

public class PlantStarter {

	public static void main(String[] args) {
		
		Plant plant=new Plant();
		System.out.println(plant);
		System.out.println(plant.hashCode());
		System.out.println(System.identityHashCode(plant));
		
		Plant plant2=new Plant();
		System.out.println(plant2);
		System.out.println(plant.hashCode());
		System.out.println(System.identityHashCode(plant2));
		
		
		plant.setName("mango");
		plant.setName("orange");
		boolean equal=plant.equals(plant);
		System.out.println(equal);
		
		/*Plant plant3=new Plant("apple",true,100,PlantType.FRUIT);
		System.out.println(plant3);*/
				
	}

}
