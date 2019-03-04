package rental;

class Movie {

    enum MovieType {
        REGULAR,
        NEW_RELEASE,
        CHILDREN
    }


    String title;
    MovieType movieType;

    Movie(String title, MovieType movieType) {
        this.title = title;
        this.movieType = movieType;
    }

    MovieType type() {
        return movieType;
    }

    String title() {
        return title;
    }
}
