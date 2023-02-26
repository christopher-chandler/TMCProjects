
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static double averageAge (ArrayList<Integer> age) {

        double average = 0;
        for (double num: age) {
            average+=num;
        }


        return average/age.size();
    }

    public static String longestName(ArrayList<String> name) {

        String personName = "";
        int length = 0;
        String longestName = "";

        for(String n: name) {

            int StringLength = n.length();

            if (StringLength > length) {
                length = StringLength;
                longestName = n;
            }


        }



        return longestName;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> name = new ArrayList<>() ;
        ArrayList<Integer> age = new ArrayList<>() ;

        while(true) {

            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            } else {
                String[] csv =  userInput.split(",");

                name.add(csv[0]);
                age.add(Integer.valueOf(csv[1]));

            }
        }

        System.out.print("Longest name: ");
       System.out.println(longestName(name));
        System.out.print("Average of the birth years: ");
        System.out.print(averageAge(age));

    }


}
