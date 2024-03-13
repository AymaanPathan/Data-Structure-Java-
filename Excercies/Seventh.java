

import java.util.Scanner;

public class Seventh {
    public static void power(int num1 ,int num2){
        double power = Math.pow(num1,num2);
        System.out.println("the Power Of " +num1+"Raised to "+ num2+" is " +power);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter Second Number");
        power(num1, num2);
        sc.close();
    }
}
