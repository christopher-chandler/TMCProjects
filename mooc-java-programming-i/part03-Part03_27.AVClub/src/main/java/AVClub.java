
import java.util.Scanner;

public class AVClub {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {


           String famousLastWords = scanner.nextLine();

           String [] words = famousLastWords.split(" ");
           int lastWord =  words.length-1;


           if (famousLastWords.equals("")) {
               break;
            } else {

               for (String word: words) {
                   if(word.contains("av")) {
                       System.out.println(word);
                   }
               }


           }

        }
        


    }
}
