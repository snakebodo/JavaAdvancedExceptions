package Task2ClassesAndInterfaces;

public class Movie {

    private String title;
    private String director;
    private int yearOfRelease;
    private String genre;
    private String distributor;

/*    public Movie() {
    }*/

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    @Override
    public String toString() {
        return "Movie: " +
                "\nTitle: " + title +
                "\nDirector: " + director +
                "\nYear Of Release: " + yearOfRelease +
                "\nGenre: " + genre +
                "\nDistributor: " + distributor + "\n";
    }

    static class MovieCreator {
        private String title;
        private String director;
        private int yearOfRelease;
        private String genre;
        private String distributor;

        public MovieCreator setTitle(String title) {
            this.title = title;
            return this;
        }

        public MovieCreator setDirector(String director) {
            this.director = director;
            return this;
        }

        public MovieCreator setYearOfRelease(int yearOfRelease) {
            this.yearOfRelease = yearOfRelease;
            return this;
        }

        public MovieCreator setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public MovieCreator setDistributor(String distributor) {
            this.distributor = distributor;
            return this;
        }

        public Movie createMovie(){
            Movie movie = new Movie();
            movie.setTitle(title);
            movie.setDirector(director);
            movie.setYearOfRelease(yearOfRelease);
            movie.setGenre(genre);
            movie.setDistributor(distributor);
            return movie;
        }
    }
}
