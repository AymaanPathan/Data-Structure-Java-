public class primefor {

    public static boolean prime(double nums) {
        for(int i=0;i<Math.sqrt(nums);i++){
            int counter = 2;
            if(nums<1) {
                return false;
            }
            if(nums%counter==0){
                return false;
            }
            counter++;
        }
        return true;
    }
    public static void main(String[] args) {
        int num =31;
        System.out.println(prime(num));
    }
}
