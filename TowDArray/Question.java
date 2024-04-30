

import java.util.Scanner;

public class Question {

    public static void Greatest(int[][] nums) {
        
        // int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(nums[i][j]>max) {
                    max = nums[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("The Greatest Number in Matrix is: "+max);
        // return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nums = new int[3][3];

        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Enter Value");
                nums[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        Greatest(nums);
        sc.close();
    }
}
