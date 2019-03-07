package rental;

public class Movie {

    public enum MovieType {
        一般,
        新作,
        子供;
    }

    String title;
    MovieType movieType;

    public Movie(String title, MovieType movieType) {
        this.title = title;
        this.movieType = movieType;
    }

    public MovieType type() {
        return movieType;
    }

    public String title() {
        return title;
    }
}
