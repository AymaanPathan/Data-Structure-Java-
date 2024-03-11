
/**
 * oddEven
 */
public class oddEven {
    public static boolean isOdd(int nums) {
        return (nums & 1) == 1;
    }

    public static void main() {
        int n = 53;
        System.out.println(isOdd(n));
    }
}