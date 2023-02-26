

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());

        boolean inArray = false;
        int index = 0;

        for (int i = 0; i< array.length; i++) {

            int entry = array[i];

            if (entry == searching) {
                inArray = true;
                index = i;
                break;

            }


        }

        if(inArray) {
            String res = String.format("%d is at index %d.",searching, index);
            System.out.println(res);

        } else {
            String res = String.format("%d was not found.",searching);
            System.out.println(res);

        }

    }

}
