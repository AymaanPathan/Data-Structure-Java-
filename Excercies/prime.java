public class prime {
    public static void main(String[] args) {
        int num = 13;
        if(primeCode(num)) {
            System.out.println(num+ ": is a Prime Number");
        }else {
            System.out.println(num+ ": is Not A Prime Number");

        }
    }

    public static boolean primeCode(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num % i==0){
                return false;
            }
        }
        return true;
    }
}
