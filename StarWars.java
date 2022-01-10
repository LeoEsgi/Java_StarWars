import java.util.Scanner;

class StarWars {
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
   
    createFilm("Star Wars" , 1977 , 4 , 1000000000L , 3000000000L );

    createFilm("L'Empire contre-attaque", 1980, 5, 5000000L, 600000000L);

    askUserToCreateFilm(sc);
}

public static void createFilm(String title, int release , int number ,Long cost , Long revenue){
 
Movie newMovie = new Movie(title , release , number , cost , revenue);
System.out.println("New Movie : " + newMovie.toString());    

}

public static void askUserToCreateFilm(Scanner scanner){
    System.out.println("Veuillez saisir les informations du nouveau film");
    System.out.println("---");

    System.out.println("Titre :");
    String title = scanner.nextLine();

    System.out.println("Annee :");
    String year = scanner.nextLine();

    System.out.println("Episode numero :");
    String number = scanner.nextLine();

    System.out.println("Cout :");
    String cost = scanner.nextLine();

    System.out.println("Recette :");
    String revenue = scanner.nextLine();

    createFilm(title, Integer.parseInt(year), Integer.parseInt(number), Long.parseLong(cost), Long.parseLong(revenue));
}


}