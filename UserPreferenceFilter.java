import java.util.List;
/**
 * The UserPreferenceFilter class extends movie and adds some extra functions
 * determines whether the movie matches the keywords the user enters in
 */
public class UserPreferenceFilter extends Movie { //subclass of Movie
    private boolean matchesPreference;//switch that is flicked on if movie matches any of users preferences
//constructor that calls superclass Movie
    /**
     * makes a UserPreferenceFilter constructor
     * 
     * @param title    title of movie
     * @param genre    genre of movie
     * @param description   description of the movie
     */
    public UserPreferenceFilter(String title, String genre, String description) {
        super(title, genre, description);
        matchesPreference = false;//important: default resorts to no match until checked
    }
    
    /**
     * Checks whether any of keywords appear in movie's description
     *
     * @param userKeywords    list of keywords entered by user
     */
    public void checkMatch(List<String> userKeywords) {// takes ArrayList as parameter
        String lowerDesc = description.toLowerCase(); //convert to lowercase
        for (String keyword : userKeywords) {
            if (lowerDesc.contains(keyword.toLowerCase())) {
                matchesPreference = true;//set to true if keyword is found in description of movie
                break;//no need to check further, hence a break statement is used
            }
        }
    }
    /**
     * Returns whether movie matches specified keywords as a boolean
     * 
     * @return true if movie matches, otherwise false
     */
    public boolean isMatch() {
        return matchesPreference;
    }
}