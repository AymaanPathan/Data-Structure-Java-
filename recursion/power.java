public class power {

    public static boolean p(int num) {
        if(num<=0){
            return false;
        }
        if(num==1){
            return true;
        }
        return (num%2==0 && p(num/2));
    }
    public static void main(String[] args) {
       System.out.println(p(3));
    }
}
