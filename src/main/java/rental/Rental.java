package rental;

public class Rental {
    Movie movie;
    int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie movie() {
        return movie;
    }

    public int daysRented() {
        return daysRented;
    }
}
