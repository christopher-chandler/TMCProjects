import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Book> book = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            int id = Integer.parseInt(scanner.nextLine());
            int publication = Integer.parseInt(scanner.nextLine());

            book.add(new Book(name, id, publication));

        }

        System.out.print("What information will be printed? ");
        String input = scanner.nextLine();

        if (input.equals("everything")) {
            for (Book item: book) {
                System.out.println(item);
            }
        }   else if (input.equals("name")) {
            for (Book item : book) {
                System.out.println(item.printName());
            }

        }
    }
}
