import java.util.Scanner;

public class calCulator {
    public static void main(String[] args) {
        System.out.println("Select Operator:");
        int ans =0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            char op = sc.next().trim().charAt(0);
             if(op=='n'){
                sc.close();
                 break;
             }
            System.out.println("Enter Two Number: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if(op=='+'){
                 ans = num1+num2; 
                System.out.println("Sum Of this Two Number is: "+ans);
            }
           else if(op=='-'){
                 ans = num1+num2; 
                System.out.println("Subtarction Of this Two Number is: "+ans);
            }
           else if(op=='*'){
                 ans = num1*num2; 
                System.out.println("Multiplication Of this Two Number is: "+ans);
            }
           else if(op=='%'){
            if(num2!=0) {
                ans = num1%num2; 
            }
                System.out.println("Division Of this Two Number is: "+ans);
            }
          
            // sc.close();
            }
            
    }
}