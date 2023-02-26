
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int oldest = 0;
        String oldestName = "";

        ArrayList<String> name = new ArrayList<>() ;
        ArrayList<String> age = new ArrayList<>() ;

        while(true) {

            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            } else {
                String[] csv =  userInput.split(",");

                name.add(csv[0]);
                age.add(csv[1]);
                int oldestPerson = Integer.valueOf(csv[1]);


                if (oldestPerson > oldest) {
                    oldest = oldestPerson;
                    oldestName=csv[0];
                }

                counter += 1;

            }
        }

        System.out.print("Name of the oldest: ");
        System.out.print(oldestName);


    }
}
