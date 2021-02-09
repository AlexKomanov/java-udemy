package part_1.objectClassMethods;

public class ObjectClassMethods {
    public static void main(String[] args) {

        User user = new User();
        User user1 = new User();

        System.out.println("************* HashCode *************");
        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());

        System.out.println("************* Equals *************");
        System.out.println("user.equals(user1) = " + user.equals(user1));

        System.out.println("************* ToString *************");
        System.out.println(user.toString());
        System.out.println(user1.toString());
        user = user1;

        System.out.println("************* user == user1 *************");
        System.out.println(user.toString());
        System.out.println(user1.toString());

        System.out.println("user.equals(user1) = " + user.equals(user1));



    }
}
