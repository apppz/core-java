package xworkz.com.methodoverriding;

import xworkz.com.methodoverriding.constants.TyreType;

public class Tyre {
	
	private String brand;
	private TyreType type;
	private float price;

	
	public Tyre() {
		System.out.println("invoked tyre");
	}


	public Tyre(String brand, TyreType type, float price) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public TyreType getType() {
		return type;
	}


	public void setType(TyreType type) {
		this.type = type;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}
	
	public String toString()
	{
		System.out.println("invoked toString");
		return "indux";
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("invoked equals");
		if(obj==null)
		{
			System.out.println("your passing value is not proper");
			return false;
		}
		if(obj instanceof Tyre)
		{
			System.out.println("correct org");
			Tyre casted=(Tyre) obj;
			String castedBrand=casted.brand;
			if(this.brand.equals(castedBrand))
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
			System.err.println("pass tyre");
		}

		return true;
	
	}
}
