package loops;

public class Loops {
    public static void main(String[] args) {

        /* ***** For Loop ***** */
        System.out.println("\n***** For Loop *****\n");
        for (int i = 0; i < 5; i++) {
            if (i == 3){
                continue;
            }
            System.out.println("number " + i);
        }

        /* ***** While Loop ***** */
        System.out.println("\n***** While Loop *****\n");
        int i = 0;
        while (i < 5){
            if (i == 3){
                break;
            }
            System.out.println("number " + i);
            i++;
        }

        /* ***** Do While Loop ***** */
        /* Will execute (do part) at least once. If 'while' part is 'false' -> will finish the loop */
        System.out.println("\n***** Do While Loop *****\n");
        i = 6;
        do {
            System.out.println("number " + i);
            i++;
        }
        while (i < 5);
    }
}
