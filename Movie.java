import java.util.Date;

public class Movie {
    String title;
    Date release_date;
    Integer number;
    Float cost;
    Float revenue;

    public Movie(String title, Date release_date, Integer number, Float cost, Float revenue) {
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
    public Date getRelease_date() {
        return release_date;
    }
    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public Float getCost() {
        return cost;
    }
    public void setCost(Float cost) {
        this.cost = cost;
    }
    public Float getRevenue() {
        return revenue;
    }
    public void setRevenue(Float revenue) {
        this.revenue = revenue;
    }


    @Override
    public String toString() {
        return "Movie [cost=" + cost + ", number=" + number + ", release_date=" + release_date + ", revenue=" + revenue
                + ", title=" + title + "]";
    }

    
}