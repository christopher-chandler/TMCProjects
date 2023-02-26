
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int numbers = 0;
        try (Scanner inFile = new Scanner(Paths.get(file))) {
            while (inFile.hasNextLine()) {

                int line = Integer.valueOf(inFile.nextLine());

                if (line >= lowerBound && line <= upperBound){
                    numbers++;
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("Numbers: ");
        System.out.print(numbers);
    }

}
