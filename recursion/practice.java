
/**
 * practice
 */
import java.util.Arrays;

public static int[] sortArray(int[] nums) {
    int mid = nums.length / 2;
    int[] rightPart = sortArray(Arrays.copyOfRange(nums, 0, mid));
}