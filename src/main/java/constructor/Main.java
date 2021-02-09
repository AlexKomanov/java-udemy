package constructor;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        user.setName("Alex");;
        System.out.println("user.getName() = " + user.getName());

        User user1 = new User(32, "Alexander", "passport");
        System.out.println("user1.getAge() = " + user1.getAge());

    }
}
