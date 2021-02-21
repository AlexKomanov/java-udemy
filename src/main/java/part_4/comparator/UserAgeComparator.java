package part_4.comparator;

import java.util.Comparator;

public class UserAgeComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if (o1.getAge() == o2.getAge()){
            return 0;
        }
        else if(o1.getAge() < o2.getAge()){
            return -1;
        }
        else {
            return 1;
        }
    }
}
