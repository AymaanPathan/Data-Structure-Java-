public class practice {
    public static int isfactorial(int range) {
       int factorial = 1;
       for(int i=1;i<=range;i++){
       factorial*=i;
       }
       return factorial;
    }

    public static void main(String[] args) {
        int range = 5;
        System.out.println(isfactorial(range));
    }
}
