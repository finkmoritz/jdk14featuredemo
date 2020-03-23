package records;

public class UserBefore {

    public static long nUsers;
    private String name;
    private int age;
    private boolean isAdmin;

    public UserBefore(String name, int age, boolean isAdmin) {
        this.name = name;
        this.age = age;
        this.isAdmin = isAdmin;
        nUsers++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
