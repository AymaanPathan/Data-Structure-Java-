public class isPrime {
    public static boolean Prime(int num) {
        int c=2;
        while (c<num) {
            if(num<1){
                return false;
            }
            if(num%2==0){
                return false;
            }
            c++;
        }
        return true;
    }
    public static void main(String[] args) {
        int num =13;
       if(Prime(num)){
        System.out.println(num+ " is Prime ");
       } else {
        System.out.println(num+" Not a Prime ");
       }
    }
}