class NailCutterRunner
{
public static void main(String[] args)
{
NailCutter nail=new NailCutter();
nail.name="victorinox nail";
nail.size=NailCutterSize.SMALL;
nail.brand="hole blister";
nail.price=90.0f;
nail.noOfBlades=2;

NailCutter nail1=new NailCutter();
nail1.name="bare essensials";
nail1.size=NailCutterSize.BIG;
nail1.brand="fine quality";
nail1.price=100.0f;
nail1.noOfBlades=3;

nail.nailCutting();
nail.trimming();

nail1.nailCutting();
nail1.trimming();


}
}