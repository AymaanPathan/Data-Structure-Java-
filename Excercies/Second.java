
import java.util.Scanner;

public class Second {
    public static void oddNums(int num){
        for(int i=1;i<=num;i++){
            if(i%2==0) {
                // 
            }
            else {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        oddNums(n);
        sc.close();
    }
}
