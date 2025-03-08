import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class WordProvider {
    //String -> categories , List -> words in category
    private HashMap<String, List<String>> wordList;      
    
    public WordProvider() {
        wordList = new HashMap<>();
        loadCategories();

    } 
    private void loadCategories() {
        wordList.put("Animals", Arrays.asList("zebra","snake","turle","horse","penguin","bird","dog","cat","deer"
        ,"fish","pig","elephant","tiger","lion","giraffe","dolphin","crow","panda"));
        
        wordList.put("Countries", Arrays.asList("england","thailand","malaysia","vietnam","cambodia","china","united states of america"
        ,"wales","scotland","australia","france","germany","poland","italy","columbia","brazil","japan","south korea","canada","ireland","mexico"
        ,"new zealand","netherland","switzerland","india","mongolia"));
    }
    public List<String> getCategory() {
        return new ArrayList<>(wordList.keySet());
    }
    public String randomWord(String category) {
        List<String> words = wordList.get(category);
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }
    
}
