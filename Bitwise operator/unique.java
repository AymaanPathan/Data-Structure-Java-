public class unique {

    public static int findUnique(int[] nums) {
        int unique = 0;
        for (int n : nums) {
            unique ^= n;
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 3, 4, 2, 6, 4 };
        System.out.println(findUnique(nums));
    }
}
