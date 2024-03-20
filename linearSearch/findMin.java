public class findMin {
    public static int find(int nums[]) {
        int min = nums[0];
        for(int i=0;i<=nums.length-1;i++){
            if(min>nums[i]) {
                min = nums[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        int nums[] = {99,90,78,192,56};
        System.out.println(find(nums));
    }
}
