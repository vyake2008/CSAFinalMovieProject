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
    public void extractKeywords() {
        String[] words = description.toLowerCase().split("[ ,.!?;:\\-]+");
        keywordList = extractRecursive(words, 0, new ArrayList<>());
    }
/** 
 * Recursively makes a list of keywords by taking a look at each and every word
 * 
 * @param words    the array of words from description
 * @param index    the current index being viewed
 * @param result   the current list of unique keywords
 * @return         the complete list of valid keywords after the recursive sequence
 */

    public List<String> extractRecursive(String[] words, int index, List<String> result) {
        if (index >= words.length) {
            return result; //default: stop when all the words have been looked at
        }

        String word = words[index];
        if (word.length() > 3 && !result.contains(word)) {
            result.add(word); //adding result to result list
        }

        return extractRecursive(words, index + 1, result); //move on to next word
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
