package Task2ClassesAndInterfaces;

public class Main {
    public static void main(String[] args) {
        Movie.MovieCreator movie = new Movie.MovieCreator()
                .setTitle("Java Course")
                .setDirector("SDA")
                .setYearOfRelease(1)
                .setGenre("Horror")
                .setDistributor("Doamne Ajuta SRL");
        Movie movie1 = movie.createMovie();
        System.out.println(movie1);
    }
}
