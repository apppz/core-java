package xworkz.com.methodoverriding;

import xworkz.com.methodoverriding.constants.Quality;

public class Food {
	
	private String name;
	private float price;
	private float quantity;
	private Quality quality;
	
	
	public Food() {
		System.out.println("invoked food const");
	}
	
	
	public Food(String name, float price, float quantity, Quality quality) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.quality = quality;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public float getQuantity() {
		return quantity;
	}


	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}


	public Quality getQuality() {
		return quality;
	}


	public void setQuality(Quality quality) {
		this.quality = quality;
	}
	
	
	public String toString() {
		System.out.println("invoked toString");
		return "south food";
	}
	
	
	public boolean equals(Object obj)
	{
		System.out.println("invoked equals");
		if(obj==null)
		{
			System.out.println("your passing value is not proper");
			return false;
		}
		if(obj instanceof Food)
		{
			System.out.println("correct arg");
			Food casted=(Food) obj;
			String castedName=casted.name;
			if(this.name.equals(castedName))
			{
				System.out.println("model no matched");
				return true;
			}
			else
			{
				System.err.println("model no missmatch");
			}
		}
		
		else 
		{
			System.err.println("pass Food");
		}

		return true;
	
	}
	
	

}
