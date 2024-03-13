

import java.util.Scanner;

public class Fourth {
    public static double Circumference_GEN(double radius){
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Radius Value: ");
        double num = sc.nextDouble();
       double circumference = Circumference_GEN(num);
       System.out.println("The Circumference is " + circumference);
       sc.close();
    }
}
