package records;

public class RecordsDemo {

    public static void main(String[] args) {
        var user = new User("John Doe", 42, true);
        System.out.println(user.name()+" is "+user.age()+" years old.");

        var anotherUser = new User("Jane Doe", 33, false);
        System.out.println(anotherUser.name()+" is "+anotherUser.age()+" years old.");

        System.out.println("Number of users = "+User.nUsers);
    }
}
