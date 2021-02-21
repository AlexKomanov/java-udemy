package part_5.javaCore.nestedClasses;

public class NestedClass {

    private static int staticAge;
    private int nonStaticAge;


    public static void main(String[] args) {

    }

    public static class NestedStatic {
        void func(){
            System.out.println(staticAge);
//            System.out.println(nonStaticAge); <-- non-static fields can b accessible from static method
        }
    }
}
