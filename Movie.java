import java.util.ArrayList;
import java.util.Collection;

public class Movie {
    String title;
    int release_date;
    Integer number;
    Long cost;
    Long revenue;
    Collection<Actor> actors = new ArrayList<Actor>();

    

    public Movie() {
    }


    public Movie(String title, int release_date, Integer number, Long cost, Long revenue) {
        this.title = title;
        this.release_date = release_date;
        this.number = number;
        this.cost = cost;
        this.revenue = revenue;
    }
  
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getRelease_date() {
        return release_date;
    }
    public void setRelease_date(int release_date) {
        this.release_date = release_date;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public Long getCost() {
        return cost;
    }
    public void setCost(Long cost) {
        this.cost = cost;
    }
    public Long getRevenue() {
        return revenue;
    }
    public void setRevenue(Long revenue) {
        this.revenue = revenue;
    }



    public Collection<Actor> getActors() {
        return actors;
    }


    public void setActors(Collection<Actor> actors) {
        this.actors = actors;
    }


    @Override
    public String toString() {
        return "Movie [cost=" + cost + ", number=" + number + ", release_date=" + release_date + ", revenue=" + revenue
                + ", title=" + title + "]";
    }

    
}