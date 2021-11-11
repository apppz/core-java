package xworkz.com.methodoverriding;

import xworkz.com.methodoverriding.constants.PlantType;

public class Plant {

	private String name;
	private boolean alive;
	private int lifespan;
	private PlantType type;
	
	public Plant() {
		System.out.println("invoked plant no arg const");
	}

	public Plant(String name, boolean alive, int lifespan, PlantType type) {
		super();
		this.name = name;
		this.alive = alive;
		this.lifespan = lifespan;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public int getLifespan() {
		return lifespan;
	}

	public void setLifespan(int lifespan) {
		this.lifespan = lifespan;
	}

	public PlantType getType() {
		return type;
	}

	public void setType(PlantType type) {
		this.type = type;
	}
	
	public String toString()
	{
		System.out.println("invoked toString method");
		return "mango";
	}
	
	
	public boolean equals(Object obj)
	{
		System.out.println("invoked equals method");
		if(obj==null)
		{
		System.out.println("your passing value is not proper");
		return false;
		}
		if(obj instanceof Plant)
		{
			System.out.println("correct org");
			Plant casted=(Plant) obj;
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
			System.err.println("pass ipod ");
	}
		return true;
		
}
		
		
	}

