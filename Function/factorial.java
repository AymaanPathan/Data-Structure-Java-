package Function;

import java.util.Scanner;

public class factorial {
    public static void factorialNums(int num){
        int factorial =1;
         for(int i=num;i>=1;i--){
           factorial =factorial*i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        factorialNums(input);
        sc.close();
    }
}
