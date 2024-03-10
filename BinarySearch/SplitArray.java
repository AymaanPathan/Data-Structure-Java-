public class SplitArray {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
    }
}
