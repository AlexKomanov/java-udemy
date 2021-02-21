package part_5.javaCore.nestedClasses;

public class Main {
    public static void main(String[] args) {

        //Static class
        NestedClass.NestedStatic nestedStatic = new NestedClass.NestedStatic();
        nestedStatic.func();

        //Non-Static class
        InnerClass innerClass = new InnerClass();
        InnerClass.InnerClassExample correctInnerClass = innerClass.new InnerClassExample();

        correctInnerClass.innerClassFunc();


    }
}
