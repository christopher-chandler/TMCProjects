
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        System.out.println("Enter numbers: ");
        Statistics statistics = new Statistics();
        Scanner scanner = new Scanner(System.in);

        Statistics even = new Statistics(); ;
        Statistics odd = new Statistics();;

        while (true) {


            int num = scanner.nextInt();


            if (num == -1) {
                break;
            }

            statistics.addNumber(num);

            if ( num % 2 == 0) {

                even.addNumber(num);
            } else {
                odd.addNumber(num);
            }

        }
        System.out.print("Sum: ");
        System.out.println(statistics.sum());
        System.out.print("Sum of even numbers: ");
        System.out.println(even.sum());
        System.out.print("Sum of odd numbers: ");
        System.out.print(odd.sum());


    }
}