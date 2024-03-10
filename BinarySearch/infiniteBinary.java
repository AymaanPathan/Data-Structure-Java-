public class infiniteBinary {

    // The main perspective of this is we are not using .length method;
    public static int binarySearch(int[] nums,int target,int start, int end){
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

     static int answer(int[] nums,int target) {
        int start = 0;
        int end = 1;

        while(target>nums[end]){
            int newStart = end+1;
            // Formula: prevEnd + size *2
            end = end+ (end-start+1)*2;    //(end-start+1) =>length of an array
            start = newStart;
        }
        return binarySearch(nums,target,start,end);
     }

    public static void main(String[] args) {
        int ans[] = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(answer(ans, target));
    }
}
