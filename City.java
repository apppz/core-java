package xworkz.com.methodoverriding;

public class City {
	private String name;
	private String stateName;
	private String countryName;
	
	public City() {
		System.out.println("invoked city no arg constrct");
	}

	public City(String name, String stateName, String countryName) {
		super();
		this.name = name;
		this.stateName = stateName;
		this.countryName = countryName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	public String toString()
	{
		System.out.println("invoked toString");
		return "chikmagalur";
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("invoked equals");
		if(obj==null)
		{
			System.out.println("your passing value is not proper");
			return false;
		}
		if(obj instanceof City)
		{
			System.out.println("correct org");
			City casted=(City) obj;
			String castedMaterial=casted.name;
			if(this.name.equals(castedMaterial))
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
			System.err.println("pass name ");
		}

		return true;
	
	}

}
