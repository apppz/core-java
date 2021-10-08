class SocialMediaApp
{
String name;
float size;
String lang;
SocialPlatform platform;
float version;
SocialCompany company;

SocialMediaApp(String name,float size,String lang,SocialPlatform platform,float version,SocialCompany company)
{
this.name=name;
this.size=size;
this.lang=lang;
this.platform=platform;
this.version=version;
this.company=company;
}
SocialMediaApp()
{
	
}

void setName(String name)
{
	this.name=name;
}
void setSize(float size)
{
	this.size=size;
}
void setLanguage(String lang)
{
	this.lang=lang;
}
void setPlatform(SocialPlatform platform)
{
	this.platform=platform;
}
void setVersion(float version)
{
	this.version=version;
}
}