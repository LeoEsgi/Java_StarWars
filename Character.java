public class Character {
 String firstname;
 String lastname;
 
public Character(String firstname, String lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
}
public String getFirstname() {
    return firstname;
}
public void setFirstname(String firstname) {
    this.firstname = firstname;
}
public String getLastname() {
    return lastname;
}
public void setLastname(String lastname) {
    this.lastname = lastname;
}
@Override
public String toString() {
    return "Character [firstname=" + firstname + ", lastname=" + lastname + "]";
}



 
}