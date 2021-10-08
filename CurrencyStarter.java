class CurrencyStarter
{
	public static void main(String[] args)
	{
Currency currency=new Currency("Rupees",76);
currency.displayDetails();
currency=new currency("dollers");
currency.value=0.18f;


currency.displayDetails();
Currency currency1=new Currency("dollar",432);
currency.value=0.18f;
currency.displayDetails();

currency.country=new CountryDetail("india",91);
System.out.println(currency.country);
country.displayDetails();

Application application=new Application("java",16.2f);
application.displayDetails();

application.company=new CompanyDetail("oracle","satre kats","kanwarsingh");
CompanyDetail company=application.company;
company.displayDetails();
company.country=new CountryDetails();
CountryDetails country=company.country;
country1.displayDetails();
	}
}