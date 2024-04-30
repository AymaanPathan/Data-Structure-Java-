import java.util.Arrays;

public class sorted {
    // Binary search in a row
    public static int binary(int[] row, int cstart, int cEnd, int target) {
        while (cstart <= cEnd) {
            int mid = (cstart + cEnd) / 2;
            if (row[mid] == target) {
                return mid;
            }
            if (row[mid] < target) {
                cstart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return -1;
    }

    // Search in the matrix
    public static int[] searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int rstart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while (rstart <= rEnd) {
            int mid = (rstart + rEnd) / 2;

            int index = binary(matrix[mid], 0, cols - 1, target);
            if (index != -1) {
                return new int[]{mid, index};
            }

            // Adjust the search space based on the comparison with the middle element
            if (target < matrix[mid][cMid]) {
                rEnd = mid - 1;
            } else {
                rstart = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        System.out.println(Arrays.toString(searchMatrix(matrix, 1))); // Output: [0, 2]
    }
}
