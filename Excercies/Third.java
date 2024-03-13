

import java.util.Scanner;

public class Third {
    public static void Greater(int num1,int num2){
        if(num1>num2) {
            System.out.println(num1+ ": First Number is Greater");
        }
        else if(num2>num1) {
            System.out.println(num2+": Second Number is Greater");
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter First Number");
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter Second Number");
        Greater(num,num2);
        sc.close();
    }
}
