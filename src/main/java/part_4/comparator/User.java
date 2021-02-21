package part_4.comparator;

public class User implements Comparable<User>
{
    private String name;
    private int age;
    private int salary;

    public User(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(User o) {
        if (this.age == o.age){
            return 0;
        }
        else if (this.age < o.age){
            return -1;
        }
        else {
            return 1;
        }
    }
}
