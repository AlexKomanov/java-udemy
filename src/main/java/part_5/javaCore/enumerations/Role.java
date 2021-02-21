package part_5.javaCore.enumerations;

public enum Role {

    ADMIN("I'm an admin"),
    USER("I'm an user");

    private String role;

    Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
