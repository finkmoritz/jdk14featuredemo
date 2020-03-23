package records;

public record User(String name, int age, boolean isAdmin) {

    public static long nUsers;

    public User {
        nUsers++;
    }
}
