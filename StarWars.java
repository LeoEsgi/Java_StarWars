import java.util.ArrayList;
import java.util.Collection;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class StarWars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collection<Movie> listFilm = new ArrayList<Movie>();

        listFilm.add(createFilm("Star Wars", 1977, 4, 1000000000L, 3000000000L));

        listFilm.add(createFilm("L'Empire contre-attaque", 1980, 5, 5000000L, 600000000L));

        listFilm.add(askUserToCreateFilm(sc));

        Character dark_vador = createCharacter("Dark", "Vador");
        Character anakin = createCharacter("Anakin", "Skywalker");

        Actor hayden = createActor("Hayden", "Christensen", dark_vador , anakin);

        showMovieCollection(listFilm);



    }

    public static Movie createFilm(String title, int release, int number, Long cost, Long revenue) {

        Movie newMovie = new Movie(title, release, number, cost, revenue);
        System.out.println("New Movie : " + newMovie.toString());
        return newMovie;

    }

    public static Character createCharacter(String firstname, String lastname) {
        Character newCharacter = new Character(firstname, lastname);
        System.out.println("New Character : " + newCharacter.toString());
        return newCharacter;
    }

    public static Actor createActor(String firstname, String lastname, Character character1 , Character character2) {

        Actor newActor = new Actor(firstname, lastname);
        newActor.addCharacters(character1);
        newActor.addCharacters(character2);
        System.out.println("New Actor : " + newActor.toString());
        return newActor;
    }

    public static void showMovieCollection(Collection<Movie> col) {
        for (Movie movie : col) {
            System.out.println(movie.toString());
        }
    }

    public static Movie askUserToCreateFilm(Scanner scanner) {
        Movie newMovie = new Movie();

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

        try {
            int int_year = Integer.parseInt(year);
            int int_number = Integer.parseInt(number);
            Long long_cost = Long.parseLong(cost);
            Long long_revenue = Long.parseLong(revenue);
            newMovie = createFilm(title, int_year, int_number, long_cost, long_revenue);
        } catch (Exception e) {
            System.out.println("Erreur veuillez recommencer : " + e);
            askUserToCreateFilm(scanner);
        }

        return newMovie;

    }

    public static void makeBackUp(HashMap<Integer,Movie> movies){
        for (Map.Entry<Integer, Movie> entry : movies.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getTitle() + " " + entry.getValue().calculBénéfice());
        }
    }

}