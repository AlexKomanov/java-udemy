package part_3.collections.equalsAndHashCode;

public class Methods {
    public static void main(String[] args) {

        User user = new User();
        User user2 = new User();

        //HashCode and equals  with different links on objects
        System.out.println(user.hashCode() == user2.hashCode());
        System.out.println(user.equals(user2));

        System.out.println("\n ------------------ \n");

        User user3 = user2;

        //HashCode and equals  with the same links on objects
        System.out.println(user3.hashCode() == user2.hashCode());
        System.out.println(user3.equals(user2));

        System.out.println("\n ------------------ \n");
        User user4 = new User(30, 5000);
        User user5 = new User(30, 5000);
        //HashCode and equals  with the same parameters
        System.out.println(user4.hashCode() == user5.hashCode());
        System.out.println(user4.equals(user5));


    }
}
