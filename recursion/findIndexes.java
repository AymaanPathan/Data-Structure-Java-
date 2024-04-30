import java.util.ArrayList;

public class findIndexes {
    static ArrayList<Integer> ans = new ArrayList<>();

    static void findAllIndex(int[] nums, int target, int i) {
        if (i == nums.length) {
            return;
        }
        if (nums[i] == target) {
            ans.add(i);
        }
        findAllIndex(nums, target, i + 1);
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 4, 5, 6 };
        findAllIndex(nums, 2, 0);
        System.out.println(ans);
    }
}
