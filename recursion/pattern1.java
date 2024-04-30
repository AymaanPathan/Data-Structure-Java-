public class pattern1 {
    public static void pattern(int r, int c) {
        if (r == 0) {
            return; // row = 4 then 3 then 2 then 1 then output
        }
        if (c < r) { // first line printed
            System.out.print("* ");
            pattern(r, c + 1); // row became row and only column +1
        } else {
            System.out.println();
            pattern(r - 1, 0); // reset colum with zero
        }
    }

    public static void main(String[] args) {
        pattern(4, 0);
    }
}
