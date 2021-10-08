class Productstarter1
{
public static void main(String[] args)
{
Product product=new Product("himalaya","facewash",100,4,2);
product.productDetails();
product.printTotalCost();

Product product1=new Product("dabur","toothpaste",300,3,2);
product1.productDetails();
product1.printTotalCost();

}
}