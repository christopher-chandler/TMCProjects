
import java.util.Scanner;

public class FirstWords {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {


                String famousLastWords = scanner.nextLine();

                String [] words = famousLastWords.split(" ");
                int lastWord =  0;


                if (famousLastWords.equals("")) {
                    break;
                } else {
                    System.out.println(words[lastWord]);

                }
        }
    }
}