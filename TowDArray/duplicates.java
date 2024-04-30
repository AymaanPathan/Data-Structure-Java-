import java.util.Arrays;

public class duplicates {
    public static void main() {
        int[] nums = {6,5,4,3,2,1,1};
        Arrays.sort(nums);
        int n = nums.length;
        System.out.println(nums[n/2]);
    };

}
