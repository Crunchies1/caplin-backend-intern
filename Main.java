import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {

        System.out.println(" ======== SOLUTION ======== \n");

        // Initialize a new letter count with specified URL
        LetterCount lc = new LetterCount("https://www.gutenberg.org/cache/epub/29364/pg29364.txt");
        // Download the webpage at the given URL and read the lines
        lc.download();
        // Print out the map and the starting letter that occurs the most 
        System.out.println(lc.getMap());
        lc.getMostOcc();

        System.out.println("\n ======== TEST THAT NONEXISTANT URL FAILS ======== \n");

        // Set the letter count URL to a non existant one and verify it fails
        lc.setUrl("https://www.nonexistantwebsitehere.txt");
        // Verify that it prints "Provided URL does not exist."
        lc.download();

    }

}
