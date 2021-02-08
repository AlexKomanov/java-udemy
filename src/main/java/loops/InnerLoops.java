package loops;

public class InnerLoops {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("inner - " + j);
            }
            System.out.println("for - " + i);
        }
        System.out.println("End");

        int i = 0;
        while (i < 3){
            int j = 0;
            while (j < 5){
                System.out.println("inner while - " + j);
                j++;
            }
            i++;
            System.out.println("while - " + i);
        }
        System.out.println("While End.");
    }
}
