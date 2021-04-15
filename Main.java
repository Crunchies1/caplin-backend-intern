import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {

        // Initialize a new letter count with specified URL
        LetterCount lc = new LetterCount("https://www.gutenberg.org/cache/epub/29364/pg29364.txt");
        // Download the webpage at the given URL and read the lines
        lc.download();
        // Print out the map and the starting letter that occurs the most 
        System.out.println(lc.getMap());
        System.out.println(lc.getMostOcc());

        // Initialize a new letter count with non existant URL
        LetterCount lcfail = new LetterCount("https://www.nonexistantwebsitehere.txt");
        // Verify that it fails
        lcfail.download();

    }

}
