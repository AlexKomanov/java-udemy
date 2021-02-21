package part_5.javaCore.nestedClasses;

public class InnerClass {

    private int nonStatic;
    private static int staticExample;

    public static void main(String[] args) {


    }

    class InnerClassExample{

        void innerClassFunc(){
            System.out.println(nonStatic);
            System.out.println(staticExample);
        }
    }
}
