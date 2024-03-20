// 5,7,7,8,8,10

import java.util.Arrays;

public class largestTwoel {
    public static int firstPosition(int[] nums,int target) {
        int start =0;
        int end = nums.length-1;
        int firstPosition =-1;
        
        while (start<=end) {
            int mid = (start+end)/2;
          if(target<=nums[mid]){
            end = mid-1;
          } else {
            start = mid+1;
          }
        if(target==nums[mid]) {
            firstPosition = mid;
        }
        }
        return firstPosition;
    }

    public static int lastPosition(int[] nums,int target) {
        int start =0;
        int end = nums.length-1;
        int lastPosition =-1;
        
        while (start<=end) {
            int mid = (start+end)/2;
           if(nums[mid]<=target){
            start = mid+1;
           }
           else{
            end = mid-1;
           }
           if(nums[mid]==target) {
            lastPosition = mid;
           }
        }
        return lastPosition;
    }
    public static int[] searchRange(int[] nums,int target) {
       int ans[] = {-1,-1};
       ans[0] = firstPosition(nums, target);
       ans[1] = lastPosition(nums, target);
       return ans;
    }

    public static void main(String[] args) {
        int[] nums ={5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
