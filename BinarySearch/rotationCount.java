public class rotationCount {
    public static int findingPivot(int[] nums) {
        int start =0;
        int end = nums.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[start]>nums[mid]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }

    public static int roatation(int[] nums) {
        int pivot = findingPivot(nums);
        if(pivot==-1){
            return 0;
        }
        return pivot = pivot+1;
    }

    public static void main(String[] args) {
        int nums[] ={1,2,3,4,8,5,6};
        System.out.println(roatation(nums));
    }
}
