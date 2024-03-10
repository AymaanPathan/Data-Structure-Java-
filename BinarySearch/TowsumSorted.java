public class TowsumSorted {
public static int first(int[] nums,int target) {
  int start =0;
  int end = nums.length-1;
  int fp = 1;
    while (start<=end) {
    if(nums[start]+nums[start+1]==target){
      return start;
     }
     if(nums[start]+nums[end]==target){
      return fp;
     }
  }
    return fp;
  } 

  public static int last(int[] nums,int target ){
    int start =0;
    int end = nums.length-1;
    int lp = 2;
      while (start<=end) {
      if(nums[start]+nums[start+1]==target){
        return lp;
       }
       if(nums[start]+nums[end]==target){
        return 2;
       }
    }
        return lp;
  }

  public static int[] getAnswer(int[] nums,int target) {
    int ans[] = {-1,-1};
    ans[0] = first(ans, target);
    ans[1] = last(ans,target);
    return ans;
  }

  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6};
    int target = 3;
    System.out.print(getAnswer(nums, target));
  }

}
