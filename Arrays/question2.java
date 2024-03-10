// Find Largest in Array

public class question2 {
    public static void main(String[] args) {
        int[] nums = {3,6,19,2,5};
        int largest = Integer.MIN_VALUE; //temporary assigninig
        int smallest = Integer.MAX_VALUE; //temporary assigninig
        for(int i=0;i<nums.length;i++){
            if(largest<nums[i]) {
                largest = nums[i];
            }
            if(smallest>nums[i]) {
                smallest = nums[i];
            }
        }
        System.out.println("Largest is: "+largest);
        System.out.println("Smallest is: "+smallest);
    }
}
