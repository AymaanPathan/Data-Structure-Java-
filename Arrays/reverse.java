import java.util.*;

public class reverse {

    public static void swapArr(int nums[],int index1,int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
    public static void reverseArr(int nums[]){
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            swapArr(nums,start,end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        reverseArr(nums);
        System.out.println(Arrays.toString(nums));
    }
}
