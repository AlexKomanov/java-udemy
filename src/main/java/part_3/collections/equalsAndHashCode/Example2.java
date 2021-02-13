package part_3.collections.equalsAndHashCode;

public class Example2 {
    public static void main(String[] args) {
        User user1 = new User(30, 5000);
        User user2 = new User(30, 5000);
        User user3 = new User(30, 5000);

        System.out.println(user1.equals(user1));

        System.out.println(user1.equals(user2) && user2.equals(user3) && user1.equals(user3));

        System.out.println(user1.equals(user2) && user2.equals(user1));

        System.out.println(user1.equals(null));


    }
}
