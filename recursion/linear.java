public class linear {
    public static int linearSearch(int[] nums, int target, int i) {
        if (i == nums.length) {
            return -1; // if target found not found after searching all elements
        }
        if (nums[i] == target) {
            return i;
        }
        return linearSearch(nums, target, i + 1); // Apply recursion to an array
    }

    public static void main(String[] args) {
        int nums[] = { 2, 3, 4, 1, 5 };
        System.out.println(linearSearch(nums, 5, 0));
    }
}
