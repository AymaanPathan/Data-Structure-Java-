import java.util.Scanner;
// Input a year and find whether it is a leap year or not.
public class leapYear {

    public static boolean leap(int year){
       if(year %4==0 && year%100!=0 || year%400==0) {
        return true;
       }
       return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter A Year To Check: ");
        int year = sc.nextInt();

        if(leap(year)) {
            System.out.println(year+" is a Leap Year");
        } else {
            System.out.println(year+" is not a Leap Year");
        }
        sc.close();
    }
}
