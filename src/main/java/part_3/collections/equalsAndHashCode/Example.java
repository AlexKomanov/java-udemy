package part_3.collections.equalsAndHashCode;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {

        Map<User, String> usersMap = new HashMap<>();

        usersMap.put(new User(30, 5000), "Alex");
        usersMap.put(new User(30, 5000), "Dimon");

        for (Map.Entry<User, String> entry : usersMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
