import java.util.ArrayList;

public class ListLinear {

    static ArrayList<Integer> ans = new ArrayList<>();

    public static void list(int[] nums, int target, int i) {
        if (i == nums.length - 1) {
            return;
        }
        if (nums[i] == target) {
            ans.add(i);
        }
        list(nums, target, i + 1);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 4, 6, 7 };
        list(nums, 4, 0);
        System.out.println(ans);
    }
}
