/**
 * fibonacci
 */
public class fibonacci {

    public static int Fibo(int num) {
        if(num<2){ //Base Case
            return num;
        }
       return Fibo(num-1) + Fibo(num-2);
    }
    public static void main(String[] args) {
        int num = 50;
        System.out.println("Fibonacci Number Of "+num+ " is: "+Fibo(num));
    }    
}