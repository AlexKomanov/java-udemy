package inputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput {
    public static void main(String[] args) throws IOException {

        /**
         * System.in.read() -> reads and return bytes of the symbol
         *
         *    while (true){
         *             int data = System.in.read();
         *             System.out.println((char) data);
         *         }
         *
         *  InputStream -> reads bytes
         *  Reader -> reads symbols
         *
         *  @InputStreamReader: Returns only one symbol
         *  InputStreamReader streamReader = new InputStreamReader(System.in);
         *  System.out.println((char) streamReader.read());
         *
         *
         * **/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insert string:");
        String line = reader.readLine();//Requires IOException handling

        System.out.println("Insert first number:");
        int number = Integer.parseInt(reader.readLine());
        System.out.println("Insert second number:");
        int number2 = Integer.parseInt(reader.readLine());
        System.out.println("sum(number, number2) = " + sum(number, number2));


    }

    public static int sum(int n1, int n2){
        return n1 + n2;
    }
}
