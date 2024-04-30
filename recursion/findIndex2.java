import java.util.ArrayList;

public class findIndex2 {
    public static ArrayList<Integer> find(int[] nums, int target, int i) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (i == nums.length) {
            return ans;
        }
        if (nums[i] == nums[target]) {
            ans.add(i);
        }
        ArrayList<Integer> allAnswer = find(nums, target, i + 1);
        ans.addAll(allAnswer);
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 4, 5, 6 };
        System.out.println(find(nums, 2, 0));
    }
}
