package part_4.comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class ExampleComparator {
    public static void main(String[] args) {

        User user = new User("Tim", 35, 3500);
        User user2 = new User("Sasha", 35, 3500);

        Comparator<User> userComparator = new UserComparator();
        Comparator<User> userAgeComparator = new UserAgeComparator();

        Map<User, Object> userMap = new TreeMap<>(userAgeComparator.thenComparing(userComparator).thenComparing(User::getName));
        userMap.put(user, "text1");
        userMap.put(user2, "text2");

        for (Map.Entry<User, Object> entry : userMap.entrySet()) {
            System.out.println(entry);
        }

    }
}
