import java.util.Arrays;

public class practice {
    public static int binary(int[] rows,int cstart,int cEnd,int target) {
        while (cstart<=cEnd) {
            int mid = (cstart+cEnd)/2;
            if(rows[mid]==target){
                return mid;
            }
            if(rows[mid]<target){
                cstart = mid+1;
            }
            else {
                cEnd = mid-1;
            }
        }
        return -1;
    }

    public static int[] search(int[][] matrix,int target) {
       int rows = matrix.length;
       int cols = matrix[0].length;
       
       int rstart = 0;
       int rEnd = rows-1;
       int cMid = cols/2;

       while (rstart<=rEnd) {
        int mid = (rstart+rEnd)/2;
        int index = binary(matrix[mid], 0, cols-1, target);
        if(index!=-1){
            return new int[]{mid,index};
        }

        if(target<matrix[mid][cMid]){
            rEnd = mid-1;
        }
        else {
            rstart = mid+1;
        }
       }
       return new int[]{-1,-1};
    }

     public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        System.out.println(Arrays.toString(search(matrix, 6))); // Output: [0, 2]
    }
}
