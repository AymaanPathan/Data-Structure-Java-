public class countEven {
    public static int findNumber(int[] nums){
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(isEven(nums[i])){
                count++;
            }
        }
        return count;
       }
   public static int count(int num) {
    int count =0;
    while(num>0){
        num= num /10;
        count++;
    }
    return count;
   }
   
   public static boolean isEven(int num){
    if (count(num)%2==0) {
        return true;
    }
    return false;
   }

   
   public static void main(String[] args) {
    int[] nums ={123,45,67,89,890};
    System.out.println(findNumber(nums));
   }
}
