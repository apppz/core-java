package xworkz.com.methodoverriding;

import xworkz.com.methodoverriding.constants.NewsLanguage;

public class NewsPaper {
	
	private String name;
	private NewsLanguage language;
	private int since;
	
	public NewsPaper() {
		System.out.println("invoked newsaper");
	}

	public NewsPaper(String name, NewsLanguage language, int since) {
		super();
		this.name = name;
		this.language = language;
		this.since = since;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NewsLanguage getLanguage() {
		return language;
	}

	public void setLanguage(NewsLanguage language) {
		this.language = language;
	}

	public int getSince() {
		return since;
	}

	public void setSince(int since) {
		this.since = since;
	}
	
	public String toString()
	{
		System.out.println("invoked toString");
		return "deccan herald";
	}
	

	public boolean equals(Object obj)
	{
		System.out.println("invoked equals");
		if(obj==null)
		{
			System.out.println("your passing value is not proper");
			return false;
		}
		if(obj instanceof NewsPaper)
		{
			System.out.println("correct org");
			NewsPaper casted=(NewsPaper) obj;
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
			System.err.println("pass np");
		}

		return true;
	
	}

}
