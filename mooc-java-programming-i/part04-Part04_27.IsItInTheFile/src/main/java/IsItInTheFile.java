
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get(file))) {

            while(reader.hasNextLine()) {
                String line = reader.nextLine();

                if (line.equals(searchedFor)) {
                    System.out.println("Found!");
                    break;
                } else {

                    if (reader.hasNextLine() != true) {

                    System.out.println("Not found.");
                    break;
                    }
                }


            }

        }catch (IOException e) {
            System.out.println(String.format("Reading the file %s failed.", file));
        }


    }
}
