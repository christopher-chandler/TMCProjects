
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {


            String famousLastWords = scanner.nextLine();

            String [] words = famousLastWords.split(" ");
            int lastWord =  words.length-1;


            if (famousLastWords.equals("")) {
                break;
            } else {
                System.out.println(words[lastWord]);

            }

        }


    }
}
