class PersonInformation{
public static void nameAndMailPrinter(){
System.out.println("Arpitha\t"+"arpitacu123@gmail.com");
}
public static void personInformation(){
System.out.println("India\t"+ "Karnataka\t"+ "chikamglore\t"+ "vijayapura");
}
}
class Favorites{
public static void favoriteActorAndMovie(){
System.out.println("yash\t"+ "kgf");
}
public static void favoritePlaceCountry(){
System.out.println("banglore\t"+ "india");
}
public static void favoriteJobRole(){
System.out.println("java developer");
}
}

class Runner{
public static void main(String[] args){
PersonInformation.nameAndMailPrinter();
PersonInformation.personInformation();
Favorites.favoriteActorAndMovie();
Favorites.favoritePlaceCountry();
Favorites.favoriteJobRole();
}
}