public class linear {
    public static void main(String[] args) {
        int target =2;
        int nums[] = {1,2,3,4,5,6};
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                System.out.println("Target Found At: "+i);
            }
        }
    }
    
}