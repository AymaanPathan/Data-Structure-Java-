public class findInMountainArrayCode {

    public int Search(int[] nums,int target){
        int peak = findInMountainArray(nums);
        int firstTry = binary(nums, target,0,peak);
        if(firstTry !=-1){
            return firstTry;
        }
        return binary(nums, target, peak+1, nums.length-1);
    }

    public static int findInMountainArray(int nums[]) {
        int start = 0;
        int end = nums.length-1;

        while(start<end) {
            int mid = (start+end)/2;
            if(nums[mid]>nums[mid+1]){
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return end;
    }

    public static int binary(int[] nums,int target,int start,int end) {

        boolean isAsc = nums[start]<nums[end];
        while (start<=end) {
            int mid = (start+end)/2;
            if(nums[mid]==target) {
                return mid;
            }
            if(isAsc){
                if(target<nums[mid]){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else {
                if(target>nums[mid]){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
    
}
