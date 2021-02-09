package part_1.objectClassMethods;

public class User1 {

    //Static variable -> belongs to Class
    public static int age;
    public String name;
    public int id;

    public User1(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public void talk(String text){
        System.out.println("I say " + text + ".");
    }

    //Static method -> belongs to Class
    public static void sayHello(){
        System.out.println("Hello!");
    }

    @Override
    public String toString() {
        return "User1{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
