package xworkz.com.methodoverriding;

import xworkz.com.methodoverriding.constants.BagSection;

public class Bag {
	
   private float price ;
   private String color;
	private BagSection section;
	
public Bag() {
	System.out.println("invoked bag no arg constrct");
}

public Bag(float price, String color, BagSection section) {
	super();
	this.price = price;
	this.color = color;
	this.section = section;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public BagSection getSection() {
	return section;
}

public void setSection(BagSection section) {
	this.section = section;
}	

public String toString() {
	System.out.println("invoked toString method");
	return "vacca";
}



public boolean equals(Object obj)
{
	System.out.println("invoked equals");
	if(obj==null)
	{
		System.out.println("your passing value is not proper");
		return false;
	}
	if(obj instanceof Bag)
	{
		System.out.println("correct org");
		Bag casted=(Bag) obj;
		String castedColor=casted.color;
		if(this.color.equals(castedColor))
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
		System.err.println("pass bag ");
	}

	return true;
}
}
