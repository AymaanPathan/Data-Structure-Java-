/**
 * practice
 */
//  arr = 2,3,4,5,6,7,8
//  Target = 5
//  Output = 3

public class binary {
    public static int binarySearch(int[] nums,int target){
        int start = 0; int end = nums.length;
        while(start<=end){
            int mid = (start+end)/2;
            if(target>nums[mid]){
                start = mid+1;
            }
            else if(target<nums[mid]){
                end = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int nums[] = {2,3,4,5,6,7,8};
        int target = 5;
        int ans = binarySearch(nums, target);
        System.out.println(ans);
    }    
}