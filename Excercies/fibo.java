import java.util.*;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
  
        int a = 0;
        int b = 1;
        int count = 2;
  
        while(count<=range){
          int temp = b;
           b = a+b;
           a = temp;
           count++;
           System.out.println(b);
        }
        sc.close();
      }
}
