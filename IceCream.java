package xworkz.com.methodoverriding;

import xworkz.com.methodoverriding.constants.IceFlavour;
import xworkz.com.methodoverriding.constants.IceType;

public class IceCream {
	
	private String name;
	private IceFlavour flavour;
	private IceType type;
	
	public IceCream() {
		System.out.println("invoked icecream no arg const");
	}

	public IceCream(String name, IceFlavour flavour, IceType type) {
		super();
		this.name = name;
		this.flavour = flavour;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IceFlavour getFlavour() {
		return flavour;
	}

	public void setFlavour(IceFlavour flavour) {
		this.flavour = flavour;
	}

	public IceType getType() {
		return type;
	}

	public void setType(IceType type) {
		this.type = type;
	}
	
	
	public String toString()
	{
		System.out.println("invoked toString");
		return "chocolate";
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
			IceCream casted=(IceCream) obj;
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
			System.err.println("pass bag ");
		}

		return true;
	
	}
	

}
