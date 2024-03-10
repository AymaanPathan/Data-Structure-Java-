public class orderAgnostic {
    public static int Search(int nums[],int target) {
        int start =0;
        int end = nums.length-1;

        boolean isAsc = nums[start]<nums[end];
        while (start<=end) {
            int mid = (start+end)/2;
            if(nums[mid]==target) {
                return mid;
            }
            if(isAsc){  //Asceding Order
                if(target<nums[mid]){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else { // Descednding Order
                if(target>nums[mid]){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {4,3,2,1};
        int target = 3;
        System.out.println(Search(nums,target));
    }
}
