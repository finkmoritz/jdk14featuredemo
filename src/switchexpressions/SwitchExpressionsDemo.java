package switchexpressions;

import java.util.Random;

public class SwitchExpressionsDemo {

    public static void main(String[] args) {
        int coinFlip = (new Random()).nextInt(2);
        String outcome = switch (coinFlip) {
            case 0 -> "Heads";
            case 1 -> "Tails";
            default -> {
                System.err.println("A coin flip should only produce 0 or 1");
                yield "Both?";
            }
        };
        System.out.println("Coin flip outcome: "+outcome);
    }
}
