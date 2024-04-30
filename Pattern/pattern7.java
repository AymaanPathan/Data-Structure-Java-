public class pattern7 {
    public static void main(String[] args) {
        int row =5;
        // Outer Loop
       for(int i=row;i>=1;i--){
        // Spaces
        for(int j=row;j>i;j--){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print( "*");
        }
        System.out.println();
       }
    }
}
