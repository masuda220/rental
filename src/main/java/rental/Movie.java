package rental;

public class Movie {

    public enum MovieType {
        REGULAR,
        NEW_RELEASE,
        CHILDREN;
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
