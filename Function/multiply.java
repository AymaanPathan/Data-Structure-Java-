package Function;

import java.util.Scanner;

public class multiply {
    public static int multiplyNum(int num1,int num2){
        int nums = num1*num2;
        return nums;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 Number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2 Number");
        int num2 = sc.nextInt();
        int multiply = multiplyNum(num1, num2);
        System.out.println("The Multiplication of "+ num1 +" & "+num2+ " is "+multiply);
        sc.close();
    }
}
