package xworkz.com.methodoverriding;

import xworkz.com.methodoverriding.constants.WatchType;

public class Watch {
	
	private String brand;
	private WatchType type;
	private float price;
	
	public Watch() {
		System.out.println("invoked watch no arg constructor");
	}

	public Watch(String brand, WatchType type, float price) {
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

	public WatchType getType() {
		return type;
	}

	public void setType(WatchType type) {
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
		System.out.println("invoked toString method");
		return "titan";
	}
	
	
	public boolean equals(Object obj)
	{
		System.out.println("invoked equals method");
		if(obj==null) 
		{
			System.out.println("passing bad");
		return false;
		}
		if(obj instanceof Ipod)
		{
			System.out.println("crt arg");
			Watch casted=(Watch) obj;
			String castedBrand=casted.brand;
			if(this.brand.equals(castedBrand))
			{
				System.out.println("brand is matched");
				return true;
			}
			else
			{
				System.err.println("brand no matched");
			}
		}
		
		else
		{
			System.out.println("pass brand");
		}
		return true;
	}
}
	
	
	