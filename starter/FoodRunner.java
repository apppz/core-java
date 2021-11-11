package xworkz.com.methodoverriding.starter;

import xworkz.com.methodoverriding.Food;

public class FoodRunner {

	public static void main(String[] args) {
		
		Food food=new Food();
		System.out.println(food);
		System.out.println(food.hashCode());
		System.out.println(System.identityHashCode(food));
		
		Food food2=new Food();
		System.out.println(food2);
		System.out.println(food2.hashCode());
		System.out.println(System.identityHashCode(food2));
		

		food.setName("Chitranna");
		food.setName("avlakki");
		boolean equal=food.equals(food);
		System.out.println(equal);
		

		

	}

}
