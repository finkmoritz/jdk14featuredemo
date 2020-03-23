package switchexpressions;

import java.util.Random;

public class SwitchExpressionsDemoBefore {

    public static void main(String[] args) {
        int coinFlip = (new Random()).nextInt(2);
        String outcome;
        switch (coinFlip) {
            case 0: outcome = "Heads";
            case 1: outcome = "Tails";
            default: {
                System.err.println("A coin flip should only produce 0 or 1");
                outcome = "Both?";
            }
        }
        System.out.println("Coin flip outcome: "+outcome);
    }
}
