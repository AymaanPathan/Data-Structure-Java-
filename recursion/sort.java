public class sort {
    public static boolean sorting(int[] nums, int i) {
        if (i == nums.length - 1) {
            return true;
        }
        return nums[i] < nums[i + 1] && sorting(nums, i + 1); // read this to understand
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 5, 6, 8 };
        System.out.println(sorting(nums, 0)); // read this to understand
    }
}
