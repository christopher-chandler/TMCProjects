import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Which files should have its contents printed?");
        String fileName = scanner.nextLine();
        try (Scanner fileFetch = new Scanner(Paths.get(fileName))) {

            while(fileFetch.hasNextLine()) {
                System.out.println(fileFetch.nextLine());

            }


        } catch (Exception e) {

        }





    }
}
