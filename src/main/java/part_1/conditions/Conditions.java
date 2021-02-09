package part_1.conditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conditions {

    public static void main(String[] args) throws IOException {

        /** Conditions compare
         * @options: > < == != & | &&(shorter checking process than in &) ||(shorter checking process than in |)
         *

         */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(reader.readLine());

        if(age >= 18 && age <= 65){
            System.out.println("Content");
        }
        else{
            System.out.println("No content.");
        }
    }
}
