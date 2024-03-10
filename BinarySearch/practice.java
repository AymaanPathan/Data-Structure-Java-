public class practice {
    public static int missingNumber(int[] nums) {
        int start =0;
        int end =nums.length-1;
        while(start<end){
            int mid = (start+end)/2;
            if(nums[mid]>=nums[mid+1]){
                end =mid+1;
            }
            else {
                start = mid+1;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int[] nums ={0,1};
        System.out.println(missingNumber(nums));
    }
}
