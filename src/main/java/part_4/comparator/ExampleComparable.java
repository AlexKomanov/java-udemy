package part_4.comparator;

import java.util.Map;
import java.util.TreeMap;

public class ExampleComparable {
    public static void main(String[] args) {

        User user = new User("Alex", 44, 3000);
        User user2 = new User("Mark", 36, 3500);

        System.out.println(user.compareTo(user2));

        Map<User, String> map = new TreeMap<>();
        map.put(user, "text1");
        map.put(user2, "text2");

        for (Map.Entry<User, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
