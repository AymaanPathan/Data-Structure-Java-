public class pattern9 {
     public static void main(String[] args) {
        int row = 5;
        for(int i=row;i>=1;i--){
            // spaces
            for(int j=row;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
