package Revision;

import java.util.Scanner;

public class revision {
       public static boolean main(String[] args) {
              Scanner sc = new Scanner(System.in);
              int num = sc.nextInt();
              sc.close();
      
              for(int i=2;i<Math.sqrt(num);i++){
                  if(num % i==0){
                    return false;
                  } 
              }
              return true;
          }
}

