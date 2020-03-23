package nullpointerexceptions;

public class NullPointerExceptionsDemo {

    public static void main(String[] args) {
        MatryoshkaDoll innerDoll = new MatryoshkaDoll();
        MatryoshkaDoll outerDoll = new MatryoshkaDoll();
        outerDoll.innerDoll = innerDoll;
        int hashCodeOfNull = outerDoll.innerDoll.iAmNull.hashCode();
    }
}
