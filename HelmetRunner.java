class HelmetRunner
{
public static void main(String[] args)
{
Helmet helmet=new Helmet();
helmet.name="vega off road";
helmet.brand="D/V sketch";
helmet.price=600.0f;
helmet.size=HelmetSize.SMALL;
helmet.weight=10;

Helmet helmet1=new Helmet();
helmet1.name="vega off road";
helmet1.brand="D/V sketch";
helmet1.price=500.0f;
helmet1.size=HelmetSize.BIG;
helmet1.weight=200;

helmet.protect();
helmet.faceShield();

helmet1.protect();
helmet1.faceShield();

}
}