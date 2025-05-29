import java.util.*; //imports EVERYTHING.

/**
 * KeywordAnalyzer class extends the movie class
 * It is responsible for taking the relevant keywords from the movie's description and filters out short words or duplicates
 */
public class KeywordAnalyzer extends Movie { //subclass of Movie
    private List<String> keywordList;
      /**List of unique keywords taken from the description of the movie*/
      
      
    /**
     * Constructs the KeywordAnalyzer object using the movie's title, genre and description
     * 
     * @param title   title of movie
     * @param genre   genre of movie
     * @param description   short description of the movie
     */
    public KeywordAnalyzer(String title, String genre, String description) {//constructor uses parameters from Movie
        super(title, genre, description);//must be first line in order to implement inheritance correctly
        keywordList = new ArrayList<>();
    }
    
    /**
     * Extracts certain keywords from the movie's description by
     * Converting description to lowercase
     * Splitting text into words using punctuation list
     * Filters out words 3 chars or less
     * Ensuring only non-occuring words are added
     */
    public void extractKeywords() { //converting the whole description to lowercase and split it into individual words using punctuation and special characters
        String[] words = description.toLowerCase().split("[ ,.!?;:\\-]+");
        for (String word : words) { //skipping short words,that are 3 chars or less, and repeated entries
            if (!keywordList.contains(word) && word.length() > 3) {
                keywordList.add(word); //add this to keyword list
            }
        }
    }
    /**
     * Return list of keywords extracted from movie's description
     * 
     * @return list of unique, significant words
     */
    public List<String> getKeywordList() {
        return keywordList; //returns the list of keywords extracted from this movie
    }
}
