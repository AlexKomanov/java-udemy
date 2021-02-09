package part_1.objects;

public class User {

    //Static variable -> belongs to Class
    public static int age;

    //Non-Static variable -> belongs to every particular Object
    public String name;
    public int id;

    public void talk(String text){
        System.out.println("I say " + text + ".");
    }

    //Static method -> belongs to Class
    public static void sayHello(){
        System.out.println("Hello!");
    }
}
