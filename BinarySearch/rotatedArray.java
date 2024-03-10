public class rotatedArray {
    // Without Duplicates
    public static int findingPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
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

    // With Duplicates
    public static int findingPivotWithDuplicates(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[start] == nums[mid] && nums[end] == nums[mid]) {
                if (nums[start] > nums[start + 1]) {
                    return start; // start
                }
                start++;
                if (nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            }
        }
        return -1;
    }

    static int search(int[] nums, int target, int start, int end) {
        int pivot = findingPivot(nums);
        if (pivot == -1) {
            return search(nums, target, 0, nums.length - 1);
        }
        if (pivot == target) {
            return pivot;
        }
        if (target > nums[start]) {
            return search(nums, target, pivot + 1, nums.length - 1);
        } else {
            return search(nums, target, 0, pivot - 1);
        }
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
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(findingPivot(nums));
    }
}
