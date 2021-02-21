package part_5.javaCore.enumerations;

public class Example2 {
    public static void main(String[] args) {

        checkRole(Role.ADMIN);
        checkRole(Role.USER);

    }

    public static void checkRole(Role role) {
        if (role == Role.ADMIN){
            System.out.println(role.getRole());
        }
        else if (role == Role.USER){
            System.out.println(role.name());
        }
    }


}
