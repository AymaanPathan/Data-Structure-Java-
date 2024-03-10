// what if we Dont Know Array is sorted in Des or Asc Order

public class agnosticBS {
    public static int agnosticBs(int[] nums, int target) {
        int start = 0; int end = nums.length-1;
        boolean isASC = nums[start]<nums[end];

        while(start<=end) {
            int mid = (start+end)/2;
            if(target==nums[mid]) {
                return mid;
            }
            if(isASC) {
                if(target>nums[mid]) {
                    start = mid+1;
                }
                else if(target<nums[mid]){
                    end = mid-1;
                }
            }
            else {
                if(target<nums[mid]) {
                    start = mid+1;
                }
                else if(target>nums[mid]){
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        int answer =  agnosticBs(nums,target);
        System.out.println(answer);
    }
}
