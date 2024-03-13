import java.util.Scanner;
// Take a number as input and print the multiplication table for it.
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(number + "x" + i+ "="+ number*i);
        }
        sc.close();
    }
}
