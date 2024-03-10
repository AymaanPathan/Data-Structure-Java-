public class floor {
    public static int floorBinary(int[] nums,int target){
        int start =0 ; int end = nums.length-1;

        if(start<=end) {
            int mid = (start+end)/2;
            if(target>nums[mid]) {
                start = mid+1;
            } else if(target<nums[mid]){
                end = mid-1;
            }
            else {
                return mid;
            }
        }
        return nums[end];
     }
     public static void main(String[] args) {
      int nums[] = {2,4,6,9,10,12};
      int target = 5;
      int answer =  floorBinary(nums,target);
      System.out.println(answer);
     }
    }
