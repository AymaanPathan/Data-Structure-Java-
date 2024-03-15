package Function;

import java.util.Scanner;

public class sum {
    public static int sumNum(int num1 ,int num2){
        return num1-num2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("No 1");
        int num1 = sc.nextInt();
        System.out.println("No 2");
        int num2 = sc.nextInt();
        System.out.println(sumNum(num1, num2));
        sc.close();
    }
}
