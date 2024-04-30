import java.util.Arrays;

public class binary {
     public static boolean searchMatrix(int[][] matrix, int target) {
        int row =0;
        int col = matrix.length-1;
        while (row<=matrix.length && col>0) {
            if(matrix[row][col]==target){
                return true;
            }
            if(matrix[row][col]<target){
                row++;
            }
            else {
                col--;
            }
        }   
        return false;
    }
  public static void main(String[] args) {
    int nums[][] = {
        {1}
    };
    System.out.println((searchMatrix(nums, 1)));
  }
}
