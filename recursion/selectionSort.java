import java.util.Arrays;

public class selectionSort {
    public static void sort(int[] nums, int length, int i, int max) {
        if (length == 0) {
            return;
        }
        if (i < length) {
            if (nums[i] > nums[max]) {
                sort(nums, length, i + 1, i);
            } else {
                sort(nums, length, i + 1, max);
            }
        } else {
            int temp = nums[max];
            nums[max] = nums[i - 1];
            nums[i - 1] = temp;
            sort(nums, length - 1, 0, 0);
        }
    }

    public static void main(String[] args) {
        int nums[] = { 4, 6, 2, 3, 8, 7, 1, 9 };
        sort(nums, nums.length - 1, 0, 0);
        System.out.println(Arrays.toString(nums));
    }
}
