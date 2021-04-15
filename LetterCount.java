import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
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

    public void readLine(String line) {
        String[] words = line.split("\\s+");
    }

    public void download(String urlString) throws IOException {
        URL url = new URL(urlString);
        try(
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        ) {
            String line;
            while ((line = reader.readLine()) != null) {

            }
            System.out.println("Page downloaded.");
        }
   }
}
