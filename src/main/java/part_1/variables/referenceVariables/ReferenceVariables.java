package part_1.variables.referenceVariables;

public class ReferenceVariables {
    public static void main(String[] args) {

        /* Stack part - for primitive part_1.variables and references to Objects.
        *  Heap part - for Objects.
        *
        *
        *  Wrap classes of primitive part_1.variables:
        *  Byte, Short, Character, Integer, Long, Boolean, Float, Double
        */

        String str = "23";
        System.out.println(str + 2);

        int number = Integer.parseInt(str);
        System.out.println(number + 2);


    }
}
