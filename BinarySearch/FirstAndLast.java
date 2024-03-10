// Leetcode 34

public class FirstAndLast {
    public static int[] main(int nums[],int target){
        int[] ans = {-1,-1};
        ans[0] = FirstPosition(nums, target);
        ans[1] = LastPositon(nums, target);
        return ans; 
    }

    public static int FirstPosition(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        int firstPosition = -1;

        while(start<=end) {
            int mid = (start+end)/2;
            if(target<=nums[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
            if(nums[mid]==target) {
                firstPosition = mid;
            }
        }
        return firstPosition;
    }

    public static int LastPositon(int[] nums,int target) {
        int start = 0;
        int end = nums.length-1;
        int lastPosition = -1;
        while(start<=end) {
            int mid = (start+end)/2;

            if(target>=nums[mid]) {
                start = mid+1;
            } else {
                end = mid-1;
            } 
            if(nums[mid]==target){
                lastPosition = mid;
            }
        }
        return lastPosition;
    }
}
