public class factorial {

    public static int findFact(int num) {
        int factorial =5;
        for(int i=1;i<num;i++){
            factorial = factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        int ans = findFact(5);
        System.out.println(ans);
    }
}
