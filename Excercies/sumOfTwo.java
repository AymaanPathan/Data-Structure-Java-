// Take two numbers and print the sum of both.
import java.util.Scanner;
public class sumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number: ");
        int num2 = sc.nextInt();
        int ans = num1+num2;
        System.err.println("The Sum of this Two Number is = "+ans);
        sc.close();
    }
}
