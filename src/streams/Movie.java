package streams;

/**
 * @author SanketKalode
 * @date 26-06-2024
 */
public class Movie {
    private String name;
    private int year;
    private String genre;
    private double rating;

    public Movie(String name, int year, String genre, double rating) {
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
    }

    public Movie() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return STR."Movie{name='\{name}\{'\''}, year=\{year}, genre='\{genre}\{'\''}, rating=\{rating}\{'}'}";
    }
}
