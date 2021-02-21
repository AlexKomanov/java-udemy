package part_5.javaCore.nestedClasses.anonymousClasses;

public class AnonymousClass {
    public static void main(String[] args) {

        //Anonymous class with Lambda Expression
        Flyable object = () -> System.out.println("Anonymous Flying!");

        object.fly();
    }
}
