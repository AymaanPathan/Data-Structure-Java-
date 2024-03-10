
public class binarysearch {

    public static int binary(int[] nums,int target) {
        int start = 0; int end = nums.length;
        while (start<=end) {
            int mid = (start+end)/2;
            if(target>nums[mid]) {
                start = mid+1;
            } else if(target<nums[mid]) {
                end = mid-1;
            } 
            else {
                return mid;
            }
        }
        return -1;
    }
  public static void main(String[] args) {
    int nums[] = {4,5,6,7,10,12,21};
    int target = 10;
    int answer =  binary(nums,target);
    if(answer==-1) {
        System.out.println("Target Not Found! ");
    } else {
        System.out.println("Target Found At: Index "+answer);
    }
  }
}
