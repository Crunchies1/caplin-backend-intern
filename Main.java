import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        LetterCount lc = new LetterCount("https://www.gutenberg.org/cache/epub/29364/pg29364.txt");
        lc.download();
        System.out.println(lc.getMap());
        System.out.println(lc.getMostOcc());
    }

}
