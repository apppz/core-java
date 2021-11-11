package xworkz.com.methodoverriding.starter;

import xworkz.com.methodoverriding.City;

public class CityRunner {

	public static void main(String[] args) {

		City city=new City();
		System.out.println(city);
		System.out.println(city.hashCode());
		System.out.println(System.identityHashCode(city));
		
		City city2=new City();
		System.out.println(city2);
		System.out.println(city2.hashCode());
		System.out.println(System.identityHashCode(city2));
		
		city2.setName("banglore");
		city2.setName("manglore");
		boolean equal=city2.equals(city2);
		System.out.println(equal);
		
		

	}

}
