public class roatedArray {
    public static int roatated(int[] nums, int target, int s, int e) {
        if (s > e) {
            return -1; // give this if start is exceeded array length
        }
        int mid = (s + e) / 2;
        if (target == nums[mid]) {
            return mid;
        }

        if (nums[s] <= nums[mid]) {
            if (target <= nums[mid] && target >= nums[s]) {
                return roatated(nums, target, s, mid - 1);
            } else {
                return roatated(nums, target, mid + 1, e);
            }
        }

        if (target >= nums[mid] && target <= nums[e]) {
            return roatated(nums, target, mid + 1, e);
        } else {
            return roatated(nums, target, s, mid - 1);
        }

    }

    public static void main(String[] args) {
        int[] nums = { 5, 6, 7, 8, 9, 1, 2, 3 };
        System.out.println(roatated(nums, 3, 0, nums.length - 1));
    }
}
