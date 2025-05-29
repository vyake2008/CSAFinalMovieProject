/**
 * The movie class represents a movie with a title, genre and description
 * It is a superclass for other classes that extend it and it's properties
 */

public class Movie {
    protected String title; //I used protected as it is ideal for inheritatance projects, learned from AI
    protected String genre; //protected is like private initiation, but it makes the variables accessible to subclasses as well :)
    protected String description;
 //constructor to initialize a movie object with three parameters
    /**
     * Constructs a Movie object with a title, genre and description
     * 
     * @param title    title of movie
     * @param genre    genre of movie
     * @param description    short description of movie
     */
     
    public Movie(String title, String genre, String description) {
        this.title = title;//have to use this. because parameters are same as instance vars
        this.genre = genre;
        this.description = description;
    }
//below are getter methods (self explanatory, and a toString to make output appealing)
    /**
     * Returns title of movie
     * 
     * @return movie's title
     */
    public String getTitle() {
        return title;
    }
    /**
     * Returns genre of movie
     * 
     * @return movie's genre
     */
    public String getGenre() {
        return genre;
    }
    /**
     * Returns description of movie
     * 
     * @return movie's description
     */
    public String getDescription() {
        return description;
    }
    /**
     * Returns string representation of the movie
     * 
     * @return visually appealing string representing the movie
     */
    public String toString() {
        return title + " (" + genre + "): " + description;
    }
}
