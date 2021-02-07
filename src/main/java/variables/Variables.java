package variables;

public class Variables {
    public static void main(String[] args) {
        byte b = -128;
        short sh = 130;
        char c = 'e';
        int i = 2343243;
        long lng = 13414324324324324L;
        boolean bool = true;
        float fl = 34.5F;
        double dbl = 45645645645.67;

        System.out.println(c);

        c = 34435;
        System.out.println(c);

        char newChar = 't';
        c = newChar;
        System.out.println("New char = " + c);

    }
}
