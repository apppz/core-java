class FoodItemsStarter
{
public static void main(String[] args)
{
FoodItems item1=new FoodItems("poori",60,"food palace",5,FoodType.NORTHINDIAN,4,FoodOrderType.ONLINE);
item1.displayFoodDetails();
item1.printTotalPrice();



FoodItems item2=new FoodItems("friedrice",70,"chinese food center",4,FoodType.CHINESE,7,FoodOrderType.CASH);
item2.displayFoodDetails();
item2.printTotalPrice();

FoodItems.printTotalFoodItemsPrice();

}
}