
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name of the file:");
        String file = scanner.nextLine();


        try(Scanner inFile = new Scanner(Paths.get(file))) {

            while(inFile.hasNextLine()){
                String line  =(inFile.nextLine());
                String name = line.split(",")[0];
                String number = line.split(",")[1];

                String output = String.format("%s,age:%s years",name,number);
                System.out.println(output);

            }


        } catch (Exception e) {

        }



    }
}
