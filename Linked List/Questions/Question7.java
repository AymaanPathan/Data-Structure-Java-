package Questions;

public class Question7 {
    public static int findsquare(int n) {
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans += rem * rem;
            n = n / 10;
        }
        return ans;
    }

    public static boolean happy(int n) {
        int fast = n;
        int slow = n;
        do {
            slow = findsquare(slow);
            fast = findsquare(findsquare(fast));
        } while (fast != slow);

        if (slow == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(happy(n));
    }
}
