class SocialMediaAppStarter
{
public static void main(String[] args)
{
SocialMediaApp mediaApp=new SocialMediaApp();

mediaApp.setName("Whasapp");
System.out.println(mediaApp.name);

mediaApp.setSize(3);
System.out.println(mediaApp.size);

mediaApp.setLanguage("English");
System.out.println(mediaApp.lang);

//mediaApp.setPlatform(SocialPlatform.voice);
//System.out.println(mediaApp.platform);

mediaApp.setVersion(1);
System.out.println(mediaApp.version);

SocialCompany comp=new SocialCompany();
comp.setName("Instagram");
System.out.println(comp.name);

comp.setFounder("facebook");
//mediaApp.setFounder(comp);
System.out.println(comp.founder);

comp.setEstablish(2010);
//mediaApp.setCompany(comp);
System.out.println(comp.establish);

comp.setNoOfEmployees(100);
//mediaApp.setCompany(comp);
System.out.println(comp.noOfEmployees);

comp.setHeadQuaters("banglore");
//mediaApp.setCompany(comp);
System.out.println(comp.headQuaters);

comp.setRevenue(20000);
//mediaApp.setCompany(comp);
System.out.println(comp.revenue);

comp.setNoOfBranches(10);
//mediaApp.setCompany(comp);
System.out.println(comp.noOfBranches);

}
}
