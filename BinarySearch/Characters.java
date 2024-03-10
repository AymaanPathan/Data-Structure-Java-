// Leetcode 744.

public class Characters {
    public static int CharactersBinary(char[] nums,int target) {
        int start = 0;
        int end = nums.length-1;

        while (start<=end) {
            int mid = (start+end)/2;
            if(target<nums[mid]) {
                start = mid+1;
            } else if(target>nums[mid]){
                end = end-1;
            }
        }
        return nums[start % nums.length];
    }
  
}
