public class findPivot {
    public static int search(int[] nums, int target) {
        int pivot = find(nums);
        if (pivot == -1) {
            return binary(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if (nums[0] <= target) {
            return binary(nums, target, 0, pivot - 1);
        }
        return binary(nums, target, pivot + 1, nums.length - 1);
    }

    public static int find(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[start] >= nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binary(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(search(nums, 0));
    }
}
