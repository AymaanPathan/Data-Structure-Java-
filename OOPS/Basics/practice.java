package Basics;

import java.util.Arrays;

public class practice {
    public static int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("X++") || operations[i].equals("++X")) {
                ans++;
            } else {
                ans--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] operation = { "--X", "X++", "X++" };
        System.out.println(finalValueAfterOperations(operation));
    }
}
