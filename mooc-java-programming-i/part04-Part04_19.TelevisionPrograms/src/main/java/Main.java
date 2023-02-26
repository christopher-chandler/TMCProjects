import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Duration: ");
            int duration = Integer.parseInt(scanner.nextLine());

            programs.add(new TelevisionProgram(name,duration));

        }

        System.out.println("Program's maximum duration? ");
        int showDuration = scanner.nextInt();

        System.out.println();

        for (TelevisionProgram show: programs) {

            if (show.getDuration() <= showDuration) {

                System.out.println(show );


            }

        }





    }
}
