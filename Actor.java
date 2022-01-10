import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Actor {
    String lastname; 
    String firstname;
    List<Character> characters = new ArrayList<Character>() ;
    


    public Actor(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    
    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    public void addCharacters(Character characters) {
        this.characters.add(characters);
    }

    public int nbPersonnages(){
        return this.characters.size();
    }

    @Override
    public String toString() {
        return "Actor [characters=" + characters + ", firstname=" + firstname + ", lastname=" + lastname + "]";
    }

  


    
    
}
