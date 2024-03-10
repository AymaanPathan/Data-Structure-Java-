import java.util.*;

public class swap {
    public static void swapArr(int nums[],int index1,int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        swapArr(nums, 2, 1);
        System.out.println(Arrays.toString(nums));

    }
}
