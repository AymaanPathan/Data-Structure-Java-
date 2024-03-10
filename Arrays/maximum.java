

public class maximum {

    public static int findMax(int nums[]){
        int largest = nums[0];

        for(int i=1;i<nums.length;i++){
            if(largest<nums[i]) {
             largest = nums[i];
            } 
        }
        return largest;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,10};
        System.out.println(findMax(nums));
    }
}
