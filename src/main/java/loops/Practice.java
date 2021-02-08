package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter any text, 'exit' to finish");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        while (!string.equals("exit")){
            System.out.println(string);
            System.out.println("\nEnter any text, 'exit' to finish");
            string = reader.readLine();
        }
        System.out.println("End.");
    }
}
