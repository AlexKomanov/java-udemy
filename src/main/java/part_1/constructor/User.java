package part_1.constructor;

public class User {

    private int age;
    private String name;
    private String passportData;

    public User() {
    }

    public User(int age, String name, String passportData) {
        this.age = age;
        this.name = name;
        this.passportData = passportData;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPassportData() {
        return passportData;
    }

    public void talk(String text){
        System.out.println(text);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassportData(String passportData) {
        this.passportData = passportData;
    }
}
