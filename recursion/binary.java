public class binary {

    public static int bs(int[] nums, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;

        if (nums[mid] == target) {
            return mid;
        }
        if (nums[mid] < target) {
            return bs(nums, mid + 1, end, target);
        }
        return bs(nums, start, mid - 1, target);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(bs(nums, 0, nums.length - 1, 9));
    }
}
