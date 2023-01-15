package npe;

public class User {
    private final String email;
    private final String name;

    public User(String email, String name) {
        this.email = email;
        this.name = name;

        System.out.println("User " + email + " created");
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
