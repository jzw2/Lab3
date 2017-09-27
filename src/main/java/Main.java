import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


/** i hatte javadoc.
 * nom me gusta.
 *.
 * @author johnwang
 *
 */
public class Main {

    /**
     * dumb.
     * @param url is the url thing.
     * @return the stirng.
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    /**
     * i hate this stuff.
     * @param args the arguements
     */
    public static void main(final String[] args) {
        // TODO Auto-generated method stub
        String s = urlToString("http://erdani.com/tdpl/hamlet.txt");

        String[] words = s.split("\\b");

        System.out.print("the amount of words is " +  words.length);

        String wordToCount = "Prince";

        int count = 0;

        for (String word: words) {
            if (wordToCount.equalsIgnoreCase(word)) {
                count++;
            }
        }

        System.out.println(" word count for " + wordToCount + " is " + count);



    }

}
