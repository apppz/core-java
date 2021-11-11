package xworkz.com.methodoverriding;

import xworkz.com.methodoverriding.constants.SocksMaterial;
import xworkz.com.methodoverriding.constants.SocksType;

public class Socks {
	
    private String name;
	private char size;
	private float price;
	private SocksMaterial material;
	private SocksType type;
	
	public Socks() {
		System.out.println("invoked no arg socks const");
	}

	public Socks(char size, float price, SocksMaterial material, SocksType type,String name) {
		super();
		this.size = size;
		this.price = price;
		this.material = material;
		this.type = type;
		this.name=name;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public SocksMaterial getMaterial() {
		return material;
	}

	public void setMaterial(SocksMaterial material) {
		this.material = material;
	}

	public SocksType getType() {
		return type;
	}

	public void setType(SocksType type) {
		this.type = type;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String toString()
	{
		System.out.println("invoked toString method");
		return "bata";
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("invoked equals");
		if(obj==null)
		{
			System.out.println("your passing value is not proper");
			return false;
		}
		if(obj instanceof Socks)
		{
			System.out.println("correct org");
			Socks casted=(Socks) obj;
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
			System.err.println("pass socks");
		}

		return true;
	
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
