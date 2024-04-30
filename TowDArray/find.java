

import java.util.Scanner;
public class find { 
    public static void main(String[] args) {
        int[][] nums = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        int target = 3;
        for(int row=0;row<nums.length;row++){
            for(int col=0;col<nums[row].length;col++){
                if(target==nums[row][col]){
                    System.out.println("Target Found At: "+row+ " " +col);
                }
            }
            System.out.println();
        }
    }
}
