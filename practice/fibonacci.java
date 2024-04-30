public class fibonacci {

    public static int isFibonacci(int range) {
        int a = 0;
        int b = 1;

        for(int i=1;i<=range;i++){
            int c = a+b;
            a=b;
            b=c;
        }
        return a;
    }

    public static void main(String[] args) {
        int range =4;
        System.out.println(isFibonacci(range));
    }
}
