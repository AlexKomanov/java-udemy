package objects;

public class Main {
    public static void main(String[] args) {

        User user = new User();

        User.age = 25;
        //Wrong syntax of Static variable -> user.age = 32;
        user.name = "Alex";
        user.id = 243243;

        User user1 = new User();
        user1.name = "Sasha";
        user1.id = 343433;

        user.talk("Hello");
        System.out.println("user.age = " + User.age);
        System.out.println("user.name = " + user.name);
        System.out.println("user1.name = " + user1.name);
        User.sayHello();


    }
}
