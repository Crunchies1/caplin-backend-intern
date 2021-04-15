import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;
import java.util.HashMap;

public class LetterCount {

    private String url;
    private Map<Character, Integer> map;

    public LetterCount(String url) {
        this.url = url;
        this.map = new HashMap<>();
    }

    public String getUrl() {
        return this.url;
    }

    public Map<Character, Integer> getMap() {
        return this.map;
    }

    // Function which returns the starting letter that contains the most occurances
    public Map.Entry<Character, Integer> getMostOcc() {

        // Used to track largest running value
        Map.Entry<Character, Integer> maxEntry = null;

        // For each entry in the map, compare it with the last and store the maximum entry
        for (Map.Entry<Character, Integer> entry : this.map.entrySet())
        {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }

        return maxEntry;

    }

    // This function takes a string and gets each word, then puts the letter the word starts with into a map.
    // If the map already contains that letter, it will instead increment the letter count by 1.
    public void readLine(String line) {

        // Split the string into words by removing spaces
        String[] words = line.trim().split("\\s+");

        // For each word, find the first character, ignoring any non alphanumerical characters that might be
        // caught in the word.
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);

                // Add to map if first alphanumerical character is a letter, else go to next word.
                if (Character.isLetter(c)) {
                    map.put(Character.toUpperCase(c), map.getOrDefault(Character.toUpperCase(c), 0) + 1);
                    break;
                } else if (Character.isDigit(c)) {
                    break;
                }

            }
        }
    }

    // This function downloads at the given URL, then calls readLine on each line in the stream.
    public void download() throws IOException {
        URL url = new URL(this.url);
        try 
        (
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                readLine(line);
            }
            System.out.println("Page downloaded.");
        } 
        catch (Exception e) {
            System.out.println("Provided URL does not exist.");
        }
   }
}
