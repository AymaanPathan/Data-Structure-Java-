

import java.util.Scanner;

public class First {
    public static boolean isPrime(int num){
     if(num<=1){
        return false;
     }
     int c =2;
     while (Math.sqrt(c)<=num) {
        if(num%c==0){
            return false;
        }
        c++;
        if(c*c>num){
            return true;
        }
    }
    return false;
    }
    public static void main(String[] args) {
       System.out.println(isPrime(7));
    }
}