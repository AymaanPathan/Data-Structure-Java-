import java.util.Arrays;

public class bubble {
    public static void bubbleSort(int nums[], int length, int i) {
        if (length == 0) {
            return;
        }
        if (i < length) {
            if (nums[i] < nums[i + 1]) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
            bubbleSort(nums, length, i + 1);
        } else {
            bubbleSort(nums, length - 1, 0);
        }
    }

    public static void main(String[] args) {
        int nums[] = { 4, 6, 2, 3, 8, 7, 1, 9 };
        bubbleSort(nums, nums.length - 1, 0);
        System.out.println(Arrays.toString(nums));
    }
}
