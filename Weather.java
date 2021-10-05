class Weather
{
static int noOfInstances=0;
WeatherSeason season;
float temperatureInCelsius=26.0f;
String humidity;
boolean feel;

Weather(WeatherSeason season,String humidity)
{
noOfInstances++;
this.season=season;
this.humidity=humidity;
}
}