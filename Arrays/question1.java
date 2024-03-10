

public class question1 {
    public static int findFood(String[] items, String food ) {
        for(int i=0;i<items.length;i++){
            if(items[i].equals(food)) {
                return i;
            }  
        }
        return -1;

    }
    public static void main(String[] args) {
        String[] items = {"burger","vadapav","samosa","pizza"};
        String food = "vadapav";

      int  findedFood = findFood(items, food);
       
      if(findedFood !=-1) {
        System.out.println("Food Found At: "+findedFood);
      } else {
        System.out.println("Food Not Found");
      }
    }
}
